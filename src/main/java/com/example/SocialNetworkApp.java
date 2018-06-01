package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

@RequiredArgsConstructor
public class SocialNetworkApp {
    private final InputStream in;
    private final OutputStream out;
    private final Parser parser;

    public void run() throws IOException {
        try {
            LineIterator it = IOUtils.lineIterator(in, Charset.defaultCharset());
            while (it.hasNext()) {
                parser.parse(it.nextLine());
            }
        } finally {
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
