package ru.vsu.cs.kalashyan;

public class MyQueue<T> {

    private MyNode<T> head = null;
    private MyNode<T> tail = null;
    private int size = 0;

    public boolean add(T value) {
        MyNode node = new MyNode(value);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {

            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }

        size++;
        return true;
    }

    public void print() {
        int i = 0;
        MyNode ptr = head;

        while (i < size) {
            System.out.print(ptr + " ");
            ptr = ptr.getNext();
            i++;
        }
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public MyNode getHead() {
        return head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T poll() {
        T result = head.getValue();
        head = head.getNext();
        size--;
        return result;
    }

    public T peek() {
        return head.getValue();
    }
}