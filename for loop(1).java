import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
        int value = scan.nextInt();
        int sum = 0;
        for(int i=1;i<=value;i++){
            sum=sum + (i*i);
        }
        System.out.println(sum);
    }
}
