package com.example;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class ParserTest {

    @Rule public MockitoRule mocks = MockitoJUnit.rule();
    @Mock private UserService userService;
    @Mock private CommandService commandService;

    @Test
    public void create_user_Alice_when_first_seen() {
        new Parser(userService, commandService).parse("Alice /do something");
        verify(userService).createUser("Alice");
        verifyNoMoreInteractions(userService);
    }

    @Test
    public void executes_do_something_when_called() {
        new Parser(userService, commandService).parse("Alice /do something");
        verify(commandService).executeCommand("do", "something");
        verifyNoMoreInteractions(commandService);
    }

}
