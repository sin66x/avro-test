package com.behnam.avrotest;

import com.behnam.avrotest.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@SpringBootTest
class AvroTestApplicationTests {

    private static User behnamUser;
    private static String behnamJson;
    private static int behnamBinarySize;

    @BeforeAll
    static void setup(){
        behnamUser = User.newBuilder().setBirthyear("1987").setAge(35).setName("Behnam").build();
        behnamJson = "{\"name\": \"Behnam\", \"age\": 35, \"birthyear\": \"1987\"}";
        behnamBinarySize = 23;
    }

    @Test
    void serializeUserJson() throws IOException {
        Assert.assertEquals(behnamUser.toString(),behnamJson);
    }

    @Test
    void serializeUserBinary() throws IOException {
        Assert.assertEquals(behnamUser.toByteBuffer().array().length,behnamBinarySize);
    }

    @Test
    void deserializeUser() throws IOException {
        System.out.println(User.getDecoder().decode(behnamUser.toByteBuffer()));

    }
}
