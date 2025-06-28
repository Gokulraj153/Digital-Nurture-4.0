package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testMultipleReturnValues() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getStatus())
                .thenReturn("Pending")
                .thenReturn("In Progress")
                .thenReturn("Completed");
        MyService service = new MyService(mockApi);
        assertEquals("Pending", service.getStatusCheck());
        assertEquals("In Progress", service.getStatusCheck());
        assertEquals("Completed", service.getStatusCheck());
    }
}
