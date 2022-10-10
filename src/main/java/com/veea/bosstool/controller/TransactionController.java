package com.veea.bosstool.controller;

import com.veea.bosstool.model.kafka.KafkaMessage;
import com.veea.bosstool.model.transactionLog.TransactionLog;
import com.veea.bosstool.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/transactions/publish")
    @ResponseStatus(code = HttpStatus.OK)
    public KafkaMessage publish(@RequestBody TransactionLog transactionLog) throws Exception {
        KafkaMessage kafkaMessage = this.transactionService.sendAndGetKafkaMessage(transactionLog);
        return kafkaMessage;
    }

    @PostMapping("/transactions/bulk/publish")
    @ResponseStatus(code = HttpStatus.OK)
    public List<KafkaMessage> bulkPublish(@RequestBody List<TransactionLog> transactionLogs) throws Exception {
        List<KafkaMessage> kafkaMessages = this.transactionService.sendAndGetKafkaMessages(transactionLogs);
        return kafkaMessages;
    }
}