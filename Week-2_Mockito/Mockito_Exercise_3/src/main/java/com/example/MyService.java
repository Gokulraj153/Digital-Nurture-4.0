package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String getUserData(int userId) {
        return api.getUserById(userId);
    }
}
