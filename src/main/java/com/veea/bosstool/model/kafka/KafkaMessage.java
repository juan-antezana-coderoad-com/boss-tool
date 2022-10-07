package com.veea.bosstool.model.kafka;

import lombok.Data;

@Data
public class KafkaMessage {

    private String topic;
    private String message;
}
