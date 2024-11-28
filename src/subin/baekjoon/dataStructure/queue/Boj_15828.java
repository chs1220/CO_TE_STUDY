package subin.baekjoon.dataStructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Boj_15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == -1) {
                break;
            }

            if (input == 0) {
                queue.poll();
            } else {
                if (queue.size() < n) {
                    queue.add(input);
                }
            }
        }

        if (queue.isEmpty()) {
            sb.append("empty");
        } else {
            while (!queue.isEmpty()) {
                sb.append(queue.poll()).append(" ");
            }
        }
        System.out.println(sb);
    }
}
