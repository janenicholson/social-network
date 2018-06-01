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

    @Test
    public void create_user_Alice_when_first_seen() {
        new Parser(userService).parse("Alice /do something");
        verify(userService).createUser("Alice");
        verifyNoMoreInteractions(userService);
    }

}
