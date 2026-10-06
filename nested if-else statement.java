import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 digit number");
        int n=sc.nextInt();
        if(n>=100&& n<=999)
        {
            n=(n/10)%10;
            if(n%3==0){
                System.out.println("This is trendy number");
            }
            else{
                System.out.println("This is not a Trendy Number");
            }
        }
        else{
            System.out.println("Invalid Number \nplease Enter a valid number...");
        }
    }
}
