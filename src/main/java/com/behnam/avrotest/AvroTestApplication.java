package com.behnam.avrotest;

import ch.qos.logback.classic.pattern.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.MimeType;

import java.io.IOException;

@SpringBootApplication
public class AvroTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvroTestApplication.class, args);
    }

}
