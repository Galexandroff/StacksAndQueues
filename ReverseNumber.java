package StacksNQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;


public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(numbers::push);

        while(numbers.size() > 0){

            System.out.print(numbers.pop() + " ");
        }
    }
}
