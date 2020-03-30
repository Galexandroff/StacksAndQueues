package StacksNQueues;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robotsWithTime = scanner.nextLine().split(";");
        //ROB-15;
        HashMap<String , Integer> robots = new LinkedHashMap<>();
        boolean[] isBusy = new boolean[robotsWithTime.length];



        for (String robot : robotsWithTime) {
            String[] data = robot.split("-");
            robots.put(data[0], Integer.parseInt(data[1]));

        }
        String beginTime = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        String line = scanner.nextLine();

        while(!line.equals("End")){
            queue.offer(line);


            line = scanner.nextLine();
        }

        long time = 0;
        while(!queue.isEmpty()){
            time++;
            String product = queue.poll();

            for(var stringIntegerEntry : robots.entrySet()){

            }

        }
    }
}
