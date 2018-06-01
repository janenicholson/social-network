package com.example;

import java.io.InputStream;
import java.io.OutputStream;

import lombok.RequiredArgsConstructor;

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

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
