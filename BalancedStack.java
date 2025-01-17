import java.util.Stack;
public class BalancedStack {
   public static boolean isBalanced(String equation) {
       Stack<Character> stack = new Stack<>();

       for (char ch : equation.toCharArray()) {
           if (ch == '(' || ch == '{' || ch == '[') {
               stack.push(ch);
           } else if (ch == ')' || ch == '}' || ch == ']') {
               if (stack.isEmpty() || !matches(stack.pop(), ch)) {
                   return false;
               }
           }
       }
       return stack.isEmpty();
   }

   private static boolean matches(char opening, char closing) {
       return (opening == '(' && closing == ')') ||
              (opening == '{' && closing == '}') ||
              (opening == '[' && closing == ']');
   }

   public static void main(String[] args) {
       String equation = "((a+b)+(c+d)*(C*d)))";
       if (isBalanced(equation)) {
           System.out.println("Equation '" + equation + "' is balanced");
       } else {
           System.out.println("Equation '" + equation + "' is not balanced");
       }
   }
}
