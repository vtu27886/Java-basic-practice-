import java.util.*;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter the move");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        if(st.equals("rock")){
                System.out.println("Paper");
            }
        else if(st.equals("paper")){
                System.out.println("scissor");
            }
        else if(st.equals("scissor")){
                System.out.println("rock");
        }
    }
}
