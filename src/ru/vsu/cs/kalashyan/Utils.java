package ru.vsu.cs.kalashyan;

public class Utils {

    public static void solve(MyQueue<Integer> queue) {
        MyQueue<Integer> temp = new MyQueue();

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