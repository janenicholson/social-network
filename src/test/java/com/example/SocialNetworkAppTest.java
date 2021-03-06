package com.example;

import static org.mockito.Mockito.verify;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SocialNetworkAppTest 
{
    @Rule public MockitoRule mocks = MockitoJUnit.rule();
    @Mock private Parser parser;

    private InputStream in;
    private OutputStream out;

    @Test
    public void parse_single_input_line() throws IOException {
        in = SocialNetworkAppTest.class.getResourceAsStream("alice_input.txt");
        new SocialNetworkApp(in, out, parser).run();
        verify(parser).parse("Alice /post What a wonderfully sunny day!");
    }

    @Test
    public void parse_two_input_lines() throws IOException {
        in = SocialNetworkAppTest.class.getResourceAsStream("rita_and_bob.txt");
        new SocialNetworkApp(in, out, parser).run();
        verify(parser).parse("/Rita share my data");
        verify(parser).parse("/Bob sell mine to the naughty people");
    }
}
