import myPackage.myStack;

import java.util.Deque;
import java.util.LinkedList;

public class p135q92 {
    public static void main(String[] args) {
        int t = evaluateRPNExpression("1,1,+,-2,+");
        System.out.println(t);
    }

    public static int evaluateRPNExpression(String rpn){
        Deque<String> tokens = new LinkedList<String>();
        String delimiter = ",";
        String[] symbols = rpn.split(delimiter);

        for (int i = symbols.length -1; i >= 0; i--){
            tokens.addFirst(symbols[i]);
        }

        int first = Integer.parseInt(tokens.pop());
        while(!tokens.isEmpty()){
            int second = Integer.parseInt(tokens.pop());
            String op = tokens.pop();
            if (op.length() == 1 && "+-/*".contains(op)){
                switch (op.charAt(0)){
                    case '+':
                        first += second;
                        break;
                    case '-':
                        first -= second;
                        break;
                    case '*':
                        first *= second;
                        break;
                    case '/':
                        first /= second;
                        break;
                    default:
                        throw new IllegalArgumentException("not a legal RPN operator: " + op);
                }
            }
            else
                throw new IllegalArgumentException("not a legal RPN operator: " + op);
        }
        return first;
    }

}
