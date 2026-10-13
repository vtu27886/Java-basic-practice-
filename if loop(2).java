import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1 || n==2)
        {
            System.out.println(1);
        }
        else if(n==3)
        {
            System.out.println(2);
        }
        else{
            int p=1;
            while(n>4)
            {
                n=n-3;
                p=p*3;
            }
            p=p*n;
            System.out.println(p);
        }
    }
}
