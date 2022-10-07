package com.veea.bosstool.controller;

import com.veea.bosstool.model.transactionLog.TransactionLog;
import com.veea.bosstool.service.JsonMessageToBytesGenericProvider;
import com.veea.bosstool.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.veea.bosstool.util.AppConstants.Kafka.TRANSACTION_TOPIC_NAME;

@RestController
public class TransactionController {

    private KafkaProducer kafkaProducer;
    private JsonMessageToBytesGenericProvider<TransactionLog> messageBytesProvider;

    @Autowired
    public TransactionController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
        this.messageBytesProvider = new JsonMessageToBytesGenericProvider<>(TransactionLog.class);
    }

    @PostMapping("/transactions/publish")
    public ResponseEntity<String> publish(@RequestBody TransactionLog transactionLog) throws Exception {
        String jsonAsString = transactionLog.toString();
        byte[] bytes = this.messageBytesProvider.jsonMessageToBytes(jsonAsString);
        this.kafkaProducer.sendMessage(TRANSACTION_TOPIC_NAME, bytes);
        String content = String.format("Message sent: %s to kafka topic: %s", TRANSACTION_TOPIC_NAME, new String(bytes));
        return ResponseEntity.ok(content);
    }
}
