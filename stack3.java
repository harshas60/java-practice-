import java.util.Scanner;
import java.util.Stack;

 class MinStack {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    
    public static void push(int value) {
        stack.push(value);
        
        
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        } else {
            minStack.push(minStack.peek());
        }
    }

  
    public static int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; 
        }
        minStack.pop(); 
        
        return stack.pop();
    }

    
    public static int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;  
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int N = scanner.nextInt();

      
        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            push(value);
        }
      
        System.out.println("Minimum element in the stack: " + getMin());

       
        int poppedValue = pop();
        System.out.println("Popped element: " + poppedValue);

      
        System.out.println("Minimum element in the stack after popping: " + getMin());

        scanner.close();
    }
}