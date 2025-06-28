package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void notifyUser(String msg) {
        api.sendNotification(msg);
    }
}
