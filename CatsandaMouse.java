import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       int q = sc.nextInt();
       
       while(q-->0) {
           
           int x = sc.nextInt();
           int y = sc.nextInt();
           int z = sc.nextInt();
           
           int a = Math.abs(x-z);
           int b = Math.abs(y-z);
           
           if(a==b) System.out.println("Mouse C");
           if(a<b) System.out.println("Cat A");
           if(a>b) System.out.println("Cat B");
           
       }
    }
}