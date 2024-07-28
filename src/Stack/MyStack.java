package Stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop()); // Outputs 3
        System.out.println(s.pop()); // Outputs 2
        System.out.println(s.pop()); // Outputs 1
    }
}

