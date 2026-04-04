import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.in;

public class ValidParenthesis {
    private static boolean checkValidParenthesis(char[] charArr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : charArr) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if ((ch == ']' && top == '[') ||
                        (ch == '}' && top == '{') ||
                        (ch == ')' && top == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        String str = sc.next();

        char[] charArr = str.toCharArray();

        System.out.println(checkValidParenthesis(charArr));

    }
}
