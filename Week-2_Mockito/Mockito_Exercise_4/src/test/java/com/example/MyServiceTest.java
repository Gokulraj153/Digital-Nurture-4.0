package com.example;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVoidMethodCall() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        doNothing().when(mockApi).sendNotification(anyString());
        MyService service = new MyService(mockApi);
        service.notifyUser("Hello!");
        verify(mockApi).sendNotification(eq("Hello!"));
    }
}
