package DataStructures.Stack;
import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		Stack<String> appStack = new Stack<>();
		appStack.push("");
		for(int q = 0; q<Q; q++){
			int ops = sc.nextInt();
			switch(ops){
			case 1:
				String str = sc.next();
				str = appStack.peek() + str;
				appStack.push(str);
				break;
			case 2:
				int k = sc.nextInt();
				str = appStack.peek();
				appStack.push(str.substring(0, str.length()-k));
				break;
			case 3:
				k = sc.nextInt();
				System.out.println(appStack.peek().charAt(k-1));
				break;
			case 4:
				appStack.pop();
				
				break;
			}
		}
		sc.close();
	}

}
