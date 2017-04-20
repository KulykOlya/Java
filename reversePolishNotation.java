import java.util.*;
public class reversePolishNotation {
	
		public static void main(String[] args) {
    	System.out.println(reverse("12+4*5+3-"));}

		public static String reverse(String inputdata){
			
		int a = 0;
		int b = 0;	
		Stack<Integer> stack = new Stack<Integer> ();
		
		for (int i = 0; i < inputdata.length(); i++){
			if (Character.isDigit(inputdata.charAt(i)) ){
				stack.push(Character.getNumericValue(inputdata.charAt(i)));}	
			else {switch (inputdata.charAt(i)) {
					case '+':
						a = stack.pop();
						b = stack.pop();
						stack.push(b+a);
						break;
					case '-':
						a = stack.pop();
						b = stack.pop();
						stack.push(b-a);
						break;
					case '*':
						a = stack.pop();
						b = stack.pop();
						stack.push(b*a);
						break;
					case '/':
						a = stack.pop();
						b = stack.pop();
						stack.push(b/a);
						break;}}}
return stack.pop().toString();}}