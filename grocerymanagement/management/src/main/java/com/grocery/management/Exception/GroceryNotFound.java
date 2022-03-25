package com.grocery.management.Exception;

public class GroceryNotFound extends Exception{

    public GroceryNotFound(String message, Throwable throwable) {
        super(message, throwable);
    }

    public GroceryNotFound(String message) {
        super(message);
    }

    public GroceryNotFound(Throwable throwable) {
        super(throwable);
    }
}
