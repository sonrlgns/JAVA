package jump2java;
import java.util.Scanner;

class Animals{
	String name;
	int age;
	
	Animals(String name, int age){
		this.name = name;
		this.age = age;
	}
}
	
public class S05212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int age = sc.nextInt();
		sc.close();
		
		Animals dog = new Animals(name, age);
		System.out.println(dog.name);
		System.out.println(dog.age);
	}

}
