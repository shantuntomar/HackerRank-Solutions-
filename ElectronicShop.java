import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int keyboard[] = new int[n];
        int usb[] = new int[m];
        
        for(int i=0; i<n; i++) {
            keyboard[i] = sc.nextInt();
        }
        
        for(int i=0; i<m; i++) {
            usb[i] = sc.nextInt();
        }
        
        int ans = -1;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int v = keyboard[i]+usb[j];
                if( v > ans && v<=b) {
                    ans = v;
                }
            }
        }
        
        System.out.println(ans);
        
    }
}
