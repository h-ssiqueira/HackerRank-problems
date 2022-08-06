import java.util.*;
class Solution{

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            Deque<Character> stack = new ArrayDeque<>();
            if(input.length() % 2 != 0)
                System.out.println("false");
            else{
                for(int i = 0; i < input.length(); i++){
                    if(stack.isEmpty())
                        stack.addFirst(input.charAt(i));
                    else{
                        if((input.charAt(i) == ')' && stack.peek() == '(') || (input.charAt(i) == '}' && stack.peek() == '{') || (input.charAt(i) == ']' && stack.peek() == '['))
                            stack.pop();
                        else
                            stack.addFirst(input.charAt(i));
                    }
                }
                System.out.println(stack.isEmpty() ? "true" : "false");;
            }
		}

	}
}



