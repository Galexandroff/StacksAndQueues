package StacksNQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokenValues = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .limit(tokenValues[0])
                .forEach(stack::push);

        for(int i =0; i < tokenValues[1]; i++){
            stack.pop();
        }
        int minValue = Integer.MAX_VALUE;

        boolean hasRequiredValue = false;

        if(stack.isEmpty()){
            minValue = 0;
        }

        while(! stack.isEmpty() && !hasRequiredValue){
            int number = stack.pop();

            if(number==tokenValues[2]){
                hasRequiredValue = true;
                break;
            }

            if(number < minValue){
                minValue = number;
            }
        }

        if(hasRequiredValue){
            System.out.println("true");
        }else {
            System.out.println(minValue);
        }
    }
}
