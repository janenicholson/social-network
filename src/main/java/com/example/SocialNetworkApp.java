package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;

/**
 * Hello world!
 *
 */
@RequiredArgsConstructor
public class SocialNetworkApp 
{
    private final InputStream in;
    private final OutputStream out;
    private final Parser parser;

    public void run() throws IOException {
        parser.parse(IOUtils.toString(in, "UTF-8"));
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
