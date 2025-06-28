package com.example;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getUserById(anyInt())).thenReturn("Mock User");
        MyService service = new MyService(mockApi);
        String result = service.getUserData(42);
        verify(mockApi).getUserById(eq(42));
        assertEquals("Mock User", result);
    }
}
