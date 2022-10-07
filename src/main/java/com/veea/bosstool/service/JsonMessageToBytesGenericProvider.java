package com.veea.bosstool.service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.veea.bosstool.util.ConvertUtils;
import org.apache.avro.specific.SpecificRecordBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class JsonMessageToBytesGenericProvider<T extends SpecificRecordBase> {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final Class<T> clazz;

    public JsonMessageToBytesGenericProvider(Class<T> clazz) {
        this.clazz = clazz;
    }

    public byte[] jsonMessageToBytes(String jsonObject) {
        byte[] bytes = new byte[0];
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);
        try {
            T paymentApplication = mapper.readValue(jsonObject, this.clazz);
            if (paymentApplication != null) {
                bytes = ConvertUtils.convertToByteStream(paymentApplication, this.clazz);
            }
        } catch (IOException e) {
            logger.error(String.format("Error when getting ProductOrderNotification class\n%s", e.getMessage()));
        }

        return bytes;
    }
}

