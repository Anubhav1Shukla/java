import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop element
        System.out.println("Popped: " + stack.pop());

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Search element
        System.out.println("Position of 10: " + stack.search(10));

        System.out.println("Final Stack: " + stack);
    }
}
