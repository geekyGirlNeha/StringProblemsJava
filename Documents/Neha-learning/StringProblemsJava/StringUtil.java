import java.util.Stack;

public class StringUtil {

	// Method to check parenthesis balancing

	public static String isParenthesBalenced(String exp) {

		Stack<Character> stk = new Stack<Character>();
		int i = 0;
		while (i < exp.length()) {

			if (exp.charAt(i) == '[' || exp.charAt(i) == '(' || exp.charAt(i) == '{')
				stk.push(exp.charAt(i));

			else if (exp.charAt(i) == ']' || exp.charAt(i) == ')' || exp.charAt(i) == '}')
				if (stk.empty())
					return "not balanced";
				else if (exp.charAt(i) == ']') {
					if (stk.pop() != '[')
						return "not balanced";
				} else if (exp.charAt(i) == '}') {
					if (stk.pop() != '{')
						return "not balanced";
				} else if (exp.charAt(i) == ')') {
					if (stk.pop() != '(')
						return "not balanced";
				}

			i++;

		}

		if (stk.empty())
			return "balanced";

		else
			return "not balanced";
	}

	
}
