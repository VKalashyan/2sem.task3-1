package ru.vsu.cs.kalashyan;

public class Main {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(11);
        queue.add(22);
        queue.add(33);
        queue.add(44);
        queue.add(55);
        queue.add(66);
        queue.add(77);
        queue.add(88);
        queue.add(99);
        queue.add(100);

        System.out.println("Очередь до удаления нечётных:");
        queue.print();

        Utils.solve(queue);

        System.out.println();
        System.out.println("Очередь после удаления нечётных:");
        queue.print();
    }
}