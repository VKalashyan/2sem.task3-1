package ru.vsu.cs.kalashyan;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main2 {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println("До удаления нечётных:");
        System.out.println(queue);

        solve(queue);

        System.out.println("После удаления нечётных:");
        System.out.println(queue);
    }

    public static void solve(Queue<Integer> queue) {
        Queue<Integer> temp = new ArrayDeque();

        while (!queue.isEmpty()) {
            Integer i = queue.poll();

            if (i % 2 == 0) {
                temp.add(i);
            }
        }

        while (!temp.isEmpty()) {
            queue.add(temp.poll());
        }
    }
}