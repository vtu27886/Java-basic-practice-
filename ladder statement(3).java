import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter score 1:");
		int s1=sc.nextInt();
        System.out.println("Enter score 2:");
        int s2=sc.nextInt();
        System.out.println("Enter score 3:");
        int s3=sc.nextInt();
		if(s1>s2 && s1>s3)
		{
		    System.out.println("score 1 is highest");
		    System.out.println(s1);
		}
		else if(s2>s1 && s2>s3)
		{
		    System.out.println("score 2 is highest");
		    System.out.println(s2);
		}
		else if(s3>s1 && s3>s2)
		{
		    System.out.println("score 3 is highest");
		    System.out.println(s3);
		}
	}
}
