package com.example;

public class DummyService {

    public int getSum() {
        return 2 + 3;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }

    public Object getNullObject() {
        return null;
    }

    public Object getNonNullObject() {
        return new Object();
    }
}
