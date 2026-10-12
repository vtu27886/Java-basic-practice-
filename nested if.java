import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int invested=sc.nextInt();
       int earned=sc.nextInt();
       if(invested>0 && earned>0)
       {
        if(invested<earned)
        {
            int Profit=((earned-invested)*100)/invested;
            System.out.println("Profit - "+Profit+"%");
        }
        else if(invested>earned)
        {
            int Loss=((invested-earned)*100)/invested;
            System.out.println("Loss - "+Loss+"%");
        }
        else{
            System.out.println("No Profit, No Loss");   
        }
       }
       else{
        System.out.println("Invalid Input");
       }
       }
    }
