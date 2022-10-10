package com.veea.bosstool.service;

import com.veea.bosstool.model.kafka.KafkaMessage;
import com.veea.bosstool.model.transactionLog.TransactionLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.veea.bosstool.util.AppConstants.Kafka.TRANSACTION_TOPIC_NAME;

@Service
public class TransactionService {

    private KafkaProducer kafkaProducer;
    private JsonMessageToBytesGenericProvider<TransactionLog> messageBytesProvider;

    @Autowired
    public TransactionService(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
        this.messageBytesProvider = new JsonMessageToBytesGenericProvider<>(TransactionLog.class);
    }

    public KafkaMessage sendAndGetKafkaMessage(final TransactionLog transactionLog) {
        final String jsonAsString = transactionLog.toString();
        byte[] bytes = this.messageBytesProvider.jsonMessageToBytes(jsonAsString);
        this.kafkaProducer.sendMessage(TRANSACTION_TOPIC_NAME, bytes);

        KafkaMessage kafkaMessage = new KafkaMessage();
        kafkaMessage.setTopic(TRANSACTION_TOPIC_NAME);
        kafkaMessage.setMessage(new String(bytes));
        return kafkaMessage;
    }
}
