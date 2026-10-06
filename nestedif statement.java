import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
        System.out.println("Enter show Time");
        double time=sc.nextDouble();
		if(age>13)
		{
		    System.out.println("Adult");
		    if(time==13.30)
		    {
		        System.out.println("You won Special offer price!...\nPrice of movie ticket:$2.00)");
		    }
		    else{
		        System.out.println("Price of movie ticket:$5.00");
		    }
		}
		else 
		{
		    System.out.println("children");
		    System.out.println("Price of movie ticket:$2.00");
		}
	}
}
