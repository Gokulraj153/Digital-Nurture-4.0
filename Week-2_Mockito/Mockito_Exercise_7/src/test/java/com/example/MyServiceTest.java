package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVoidMethodThrowsException() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doThrow(new RuntimeException("Alert failed")).when(mockApi).sendAlert("FIRE");
        MyService service = new MyService(mockApi);
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            service.triggerAlert("FIRE");
        });
        assertEquals("Alert failed", exception.getMessage());
        verify(mockApi).sendAlert("FIRE");
    }
}
