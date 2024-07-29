package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidateParentheses {
	

	public static boolean valid(String s) {
		Map<Character , Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
		map.put('>', '<');
		
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				if(map.get(c) != stack.peek()) {
					return false;
				} else {
					stack.pop();
				}

			} else {
				stack.push(c);
			}
			
		}
		return true;
		
	}
	
	public static void main(String[] args) {
        String s = "{(<[]()>)}";
        
        System.out.println(valid(s));

       
    }
    


}

