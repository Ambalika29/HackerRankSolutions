package DataStructures.Stack;
import java.util.Scanner;
import java.util.Stack;

public class PoisonousPlants {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] array = new int[N];
		
		for(int i = 0; i< N; i++){
			array[i] = sc.nextInt();
		}
		sc.close();

		Stack<Plant> stack = new Stack<>();
		int maxDaysAlive = 0, daysAlive = 0;
		
		for(int pesticide : array){
			daysAlive = 0;
			while(stack.isEmpty() == false && pesticide <=stack.peek().pesticide){
				daysAlive = Math.max(daysAlive, stack.pop().days);
			}
			if(stack.isEmpty()){
				daysAlive = 0;
			}else{
				daysAlive+=1;
			}
			
			maxDaysAlive = Math.max(daysAlive, maxDaysAlive);
			stack.push(new Plant(pesticide, daysAlive));
		}
		
		System.out.println(maxDaysAlive);	
	}
}

class Plant{
	int pesticide;
	int days;
	
	Plant(int pesticide, int days){
		this.pesticide = pesticide;
		this.days = days;
		
	}
}
