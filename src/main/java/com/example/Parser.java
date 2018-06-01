package com.example;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Parser {

    private final UserService userService;
    private final CommandService commandService;

    public void parse(String userInput) {
        String[] tokens = userInput.split(" ");
        userService.createUser(tokens[0]);
    }

}
