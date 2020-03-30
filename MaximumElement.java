package StacksNQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();


        while(n-- >0){
            String[] tokens = scanner.nextLine().split(" ");

            switch (tokens[0]){
                case"1":
                    numbers.push(Integer.parseInt(tokens[1]));
                    break;
                case"2":
                    numbers.pop();
                    break;
                case"3":
                    System.out.println( Collections.max(numbers));
                    break;
            }
        }
    }
}
