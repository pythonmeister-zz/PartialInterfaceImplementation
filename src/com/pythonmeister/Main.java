package com.pythonmeister;

public class Main {

    public static void main(String[] args) {
	MyStack stack = new MyStack();
	MyStackWriter writer = new MyStackWriterImplementation(stack);
	MyStackReader reader = new MyStackReaderImplementation(stack);

	assert stack.size() == 0;
	assert stack.pop() == null;

	writer.push(1);
	assert stack.size() == 1;

	writer.push(2);
	assert stack.size() == 2;

	assert stack.pop().equals(2);
	assert stack.size() == 1;

	writer.push(3);
	assert stack.size() == 2;

	assert reader.pop().equals(3);
	assert reader.pop().equals(1);
	assert reader.pop() == null;
	assert stack.size() == 0;
	assert reader.pop() == null;
	assert stack.size() == 0;

    }
}
