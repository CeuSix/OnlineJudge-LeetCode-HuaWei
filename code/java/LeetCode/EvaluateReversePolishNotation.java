package LeetCode;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = new String[] { "2", "1", "+", "3", "*" };
		System.out.println(evalRPN(tokens));
	}
	public static int evalRPN(String[] tokens){
		int result=0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<tokens.length;i++){
			if(!tokens[i].equals("+") && !tokens[i].equals("-")
					&& !tokens[i].equals("*") && !tokens[i].equals("/")){
				stack.push(Integer.parseInt(tokens[i]));
			}
			else{
				String temp=tokens[i];
				int a=0;
				switch(temp){
					case "+":
						a=stack.pop();
						result=stack.pop();
						result +=a;
						break;
					case "-":
						a=stack.pop();
						result=stack.pop();
						result -=a;
						break;
					case "*":
						a=stack.pop();
						result=stack.pop();
						result *=a;
						break;
					case "/":
						a=stack.pop();
						result=stack.pop();
						result /=a;
						break;
					default:
						break;
				}
				stack.push(result);
			}
		}
		return stack.pop();
	}
}
