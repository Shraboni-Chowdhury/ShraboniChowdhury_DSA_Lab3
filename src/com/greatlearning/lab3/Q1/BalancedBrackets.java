/*Q1) Write a program of Balancing Brackets, use a suitable data structure to print
whether the string entered is a Balanced Brackets or Unbalanced String*/

package com.greatlearning.lab3.Q1;

import java.util.Stack;

public class BalancedBrackets {


	static boolean areBracketsBalanced(String expr)
	{

		Stack<Character> stack
		= new Stack<Character>();


		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{') {

				stack.push(x);
				continue;
			}


			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}


		return (stack.isEmpty());
	}


	public static void main(String[] args)
	{
		String expr = "( [ [ { } ] ] )";

		Boolean result;

		result = areBracketsBalanced(expr);


		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered String do not contain Balanced Brackets");
	}
}



