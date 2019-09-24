package com.chitamoor.service;

import com.chitamoor.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "${kafka.topic.name}")
    public void consume(Message message) throws IOException { logger.info(String.format("#### -> Consumed message from topic_one -> %s", message));
    }
}
