package com.pythonmeister;

public class MyStackWriterImplementation implements MyStackWriter{
    private MyStack stack;
    public MyStackWriterImplementation(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public void push(Object o) {
        this.stack.push(o);
    }
}
