package jump2java;
import java.util.Scanner;

public class primeNumber2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i=2; i<num; i++ ){
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("소수이다");
		
		}else {
			System.out.println("소수 아니다");
		}	
		sc.close();
		
	}

}
