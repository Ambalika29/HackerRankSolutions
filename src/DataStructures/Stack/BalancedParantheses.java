package DataStructures.Stack;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParantheses {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int t = 0; t<T; t++){
			Stack<Character> stack = new Stack<>();
			String str = sc.nextLine();
			for(int i = 0; i<str.length(); i++){
				if(stack.isEmpty()|| (stack.peek() != getCounter(str.charAt(i)))){
					stack.push(str.charAt(i));
				}else{
					stack.pop();
				}
			}
			if(stack.isEmpty()){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}
		sc.close();
	}
	
	public static char getCounter(char ch){
		switch(ch){
		case '}':
			return '{';
		case ')' :
			return '(';
		case ']':
			return '[';
		default:
			return '\0';
				
		}
	}

}
