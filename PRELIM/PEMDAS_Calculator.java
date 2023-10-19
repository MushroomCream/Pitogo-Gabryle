import java.util.*;

public class PEMDAS_Calculator {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Expression: ");
        String expression = scan.nextLine();
        System.out.println(evaluatePostfix(infixToPostfix(expression)));
    }

    static int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
  
        case '*':
        case '/':
            return 2;
  
        case '^':
            return 3;
        }
        return -1;
    }
  
    static String infixToPostfix(String exp)
    {
        String result = "";
  
        Deque<Character> stack = new ArrayDeque<Character>();
  
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isWhitespace(c)) {
                continue;
            }
  
            if (Character.isLetterOrDigit(c))
                result += c;
  
            else if (c == '(')
                stack.push(c);
  
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
  
                stack.pop();
            }
            
            else
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
  
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
        
        return result;
    }

    static double evaluatePostfix(String expression) {
        Deque<Double> stack = new ArrayDeque<Double>();

        for (int i = 0; i < expression.length(); ++i) {
            char c = expression.charAt(i);

            if(Character.isDigit(c)) {
                stack.push((double) (c - '0'));
            }
            else {
                double op2 = stack.pop();
                double op1 = stack.pop();
                double result = 0;

                switch (c) {
                    case '+':
                        result = op1 + op2;
                        break;
                    case '-':
                        result = op1 - op2;
                        break;
                    case '*':
                        result = op1 * op2;
                        break;
                    case '/':
                        if (op2 != 0) {
                            result = op1 / op2;
                        }
                        else {
                            System.out.println("Invalid Division");
                            System.exit(1);
                        }
                        break;
                    case '^':
                        result = Math.pow(op1, op2);
                        break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    } 
}