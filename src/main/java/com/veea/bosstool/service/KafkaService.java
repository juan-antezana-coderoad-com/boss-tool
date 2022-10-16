package com.veea.bosstool.service;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class KafkaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaService.class);

    private final Producer<String, byte[]> kafkaProducer;

    @Autowired
    public KafkaService(Producer<String, byte[]> kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public void sendMessage(final String topic, final byte[] data) {
        LOGGER.info("Message sent -> topic: {} data: {}", topic, new String(data));
        ProducerRecord<String, byte[]> producerRecord = new ProducerRecord<>(topic, data);
        this.kafkaProducer.send(producerRecord);
    }
}
