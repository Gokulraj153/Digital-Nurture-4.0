package com.example;

public interface ExternalApi {
    void connect();
    String fetchData();
    void disconnect();
}
