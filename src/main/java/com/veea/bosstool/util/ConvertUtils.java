package com.veea.bosstool.util;

import org.apache.avro.Schema;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * ConvertUtils class.
 */
public class ConvertUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConvertUtils.class);

    /**
     * Converts to byte stream
     *
     * @param data the data
     * @return the byte stream
     */
    public static <T extends SpecificRecordBase> byte[] convertToByteStream(T data, Class<T> clazz) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Schema schema = data.getSchema();
        Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        DatumWriter<T> writer = new SpecificDatumWriter<>(schema);
        try {
            writer.write(data, encoder);
            encoder.flush();
            out.close();
            return out.toByteArray();
        } catch (IOException e) {
            LOGGER.error(String.format("io.error.convert.byte.stream\n[%s]", e.getMessage()));
            e.printStackTrace();
        }
        return null;
    }
}
