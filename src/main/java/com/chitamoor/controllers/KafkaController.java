package com.chitamoor.controllers;

import com.chitamoor.domain.Message;
import com.chitamoor.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Value("${kafka.topic.name}")
    private String kafkaTopic;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(
            @RequestBody Message message) {
        this.producer.sendMessage(message, kafkaTopic);
    }
}
