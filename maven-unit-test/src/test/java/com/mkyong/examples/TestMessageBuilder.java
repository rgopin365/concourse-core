package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testHelloWorld() {
    	System.out.println(" ....... testHelloWorld ..... ");
        assertEquals("hello world", MessageBuilder.getHelloWorld());
        }

    @Test
    public void testNumber10() {
        assertEquals(10, MessageBuilder.getNumber10());
    }

}
