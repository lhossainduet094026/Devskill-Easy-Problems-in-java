
package dcp_32_the.grid;

import java.util.Scanner;

public class DCP_32_TheGrid {

    public static void main(String[] args) {
       int test_case,x1,y1,x2,y2,i,move ;
       Scanner sc = new Scanner(System.in);
       test_case = sc.nextInt();
       for(i = 1;i<=test_case;i++)
       {
       x1 = sc.nextInt();
       y1 = sc.nextInt();
       x2 = sc.nextInt();
       y2 = sc.nextInt();
       move = Math.abs(x1-x2)+Math.abs(y1-y2); 
       System.out.println("Case "+i+": "+move);
       }
    }
    
}
