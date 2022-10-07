package com.veea.bosstool.controller;

import com.veea.bosstool.model.kafka.KafkaMessage;
import com.veea.bosstool.model.transactionLog.TransactionLog;
import com.veea.bosstool.service.JsonMessageToBytesGenericProvider;
import com.veea.bosstool.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    @ResponseStatus(code = HttpStatus.OK)
    public KafkaMessage publish(@RequestBody TransactionLog transactionLog) throws Exception {
        String jsonAsString = transactionLog.toString();
        byte[] bytes = this.messageBytesProvider.jsonMessageToBytes(jsonAsString);
        this.kafkaProducer.sendMessage(TRANSACTION_TOPIC_NAME, bytes);

        KafkaMessage kafkaMessage = new KafkaMessage();
        kafkaMessage.setTopic(TRANSACTION_TOPIC_NAME);
        kafkaMessage.setMessage(new String(bytes));

        return kafkaMessage;
    }
}
