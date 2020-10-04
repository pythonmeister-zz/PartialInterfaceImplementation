package com.pythonmeister;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Object> stack;

    public MyStack() {
        this.stack = new ArrayList<>();
    }

    public void push(Object o) {
        this.stack.add(o);
    }

    public Object pop() {
        Object o = null;
        if (this.stack.size() > 0) {
            o = this.stack.get(this.stack.size() - 1);
            this.stack.remove(this.stack.size() - 1);
        }
        return o;
    }

    public int size() {
        return this.stack.size();
    }

}
