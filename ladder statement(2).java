import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height 1:");
		int h1=sc.nextInt();
        System.out.println("Enter height 2:");
        int h2=sc.nextInt();
        System.out.println("Enter height 3:");
        int h3=sc.nextInt();
		if(h1>h2 && h1>h3)
		{
		    System.out.println("Heaight 1 is taller");
		    System.out.println(h1);
		}
		else if(h2>h1 && h2>h3)
		{
		    System.out.println("Heaight 2 is taller");
		    System.out.println(h2);
		}
		else if(h3>h1 && h3>h2)
		{
		    System.out.println("Heaight 3 is taller");
		    System.out.println(h3);
		}
	}
}
