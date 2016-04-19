package DataStructures.Stack;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		Stack<Integer> inputStack = new Stack<>();
		Stack<Integer> auxStack = new Stack<>();
		for(int t = 0; t<T; t++){
			int op = sc.nextInt();
			switch(op){
			case 1:
				int value = sc.nextInt();
				inputStack.push(value);
				if(auxStack.isEmpty() || auxStack.peek() <= value){
					auxStack.push(value);
				}
				break;
			case 2:
				int item = inputStack.pop();
				if(item == auxStack.peek()){
					auxStack.pop();
				}
				break;
			case 3:
				System.out.println(auxStack.peek());
				break;
			}
		}
		sc.close();
	}

}
