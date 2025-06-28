package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void performAction() {
        api.voidMethod();
    }

    public String getUserData(int id) {
        return api.getUserById(id);
    }

    public void methodOrderExample() {
        api.getData();
        api.getUserById(1);
    }
}
