package chapter08;

import chapter07.MyArrayList;

public class MyStack<T> {
    private MyArrayList<T> data;
    public MyStack() {
        this.data = new MyArrayList<>();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size(){
        return data.size();
    }

    public void push(T value) {
        data.add(value);
    }

    public T peek() {
        if (data.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return data.get(data.size() - 1);
    }

    public T pop() {
        if (data.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        T topValue = peek();
        data.remove(data.size() - 1);
        return topValue;
    }


}
