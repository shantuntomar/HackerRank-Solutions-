import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<List<Integer>> lines = new ArrayList<List<Integer>>();
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            List<Integer> line = new ArrayList<>();
            int d = sc.nextInt();
            for(int j=0; j<d; j++) {
                line.add(sc.nextInt());
            }
            lines.add(line);
        }
        
        int q = sc.nextInt();
        
        for(int i=0; i<q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if( y > lines.get(x-1).size()) System.out.println("ERROR!");
            else System.out.println(lines.get(x-1).get(y-1));
            
        }
        
    }
}


