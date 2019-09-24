package com.chitamoor.service;

import com.chitamoor.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(Message message, String kafkaTopic) {
        logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(kafkaTopic, new Message(123, "Message"));
    }
}
