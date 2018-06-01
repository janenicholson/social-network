package com.example;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.io.InputStream;
import java.io.OutputStream;

public class SocialNetworkAppTest 
{
    @Rule public MockitoRule mocks = MockitoJUnit.rule();
    @Mock private Parser parser;

    private InputStream in;
    private OutputStream out;

    @Test
    public void parse_single_input_line()
    {
        in = SocialNetworkAppTest.class.getResourceAsStream("alice_input.txt");
        new SocialNetworkApp(in, out, parser).main(null);
        verify(parser).parse("Alice /post What a wonderfully sunny day!");
    }
}
