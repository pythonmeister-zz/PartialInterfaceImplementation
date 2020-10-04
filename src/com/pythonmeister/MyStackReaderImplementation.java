package com.pythonmeister;

public class MyStackReaderImplementation implements MyStackReader {
    private MyStack stack;
    public MyStackReaderImplementation(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public Object pop() {
        return this.stack.pop();
    }
}
