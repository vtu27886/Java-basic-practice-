
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();
       while(!(year%400==0||year%100!=0 && year%4==0))
       {
        year++;
       }
       System.out.println(year);
       
    }
}
