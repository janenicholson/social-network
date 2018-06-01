package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Parser {

    private final UserService userService;
    private final CommandService commandService;

    public void parse(String userInput) {
        Matcher parsedInput = Pattern.compile("(\\S+)\\s+/(\\S+)\\s*(.*)").matcher(userInput);
        parsedInput.matches();
        userService.createUser(parsedInput.group(1));
        commandService.executeCommand(parsedInput.group(2), parsedInput.group(3));
    }

}
