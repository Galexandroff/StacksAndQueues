package StacksNQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BalancedParantheses {
    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean areBalanced = true;
        String sequence = reader.readLine();

        for(int i =0; i < sequence.length(); i++){
            char symbol = sequence.charAt(i);

            if(symbol == '{' || symbol == '[' || symbol == '('){
                stack.push(symbol);
            }else {
                if(stack.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char last = stack.pop();
                if(last == '{' && symbol != '}'){
                    areBalanced = false;
                    break;
                }else if(last == '(' && symbol != ')'){
                    areBalanced = false;
                    break;
                }else if(last == '[' && symbol !=']'){
                    areBalanced = false;
                    break;
                }

            }
        }
        if(areBalanced){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
