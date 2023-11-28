package Arrays.letco;

import java.util.Stack;

//Input: tokens = ["2","1","+","3","*"]
//Output: 9
//Explanation: ((2 + 1) * 3) = 9
//Example 2:
//
//Input: tokens = ["4","13","5","/","+"]
//Output: 6
//Explanation: (4 + (13 / 5)) = 6
//Example 3:
//
//Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
//Output: 22
//Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
//= ((10 * (6 / (12 * -11))) + 17) + 5
//= ((10 * (6 / -132)) + 17) + 5
//= ((10 * 0) + 17) + 5
//= (0 + 17) + 5
//= 17 + 5
//= 22
public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {

        String s = "+-*/";

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            if(s.contains(tokens[i])){
                int pd2 = stack.pop();
                int pd1 = stack.pop();
                stack.push(eval(pd2,pd1,tokens[i]));



            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }

        }

        return stack.pop();


    }

    public static int eval(int b,int a , String pop){
        if("+".contains(pop)){
            return a + b;
        }else if("-".contains(pop)){
            return a - b;
        }else if("*".contains(pop)){
            return a * b;
        }else{
            return a / b;
        }
    }
    public static void main(String[] args){

        String[] tokens = {"4","13","5","/","+"};

        System.out.println(evalRPN(tokens));

    }
}
