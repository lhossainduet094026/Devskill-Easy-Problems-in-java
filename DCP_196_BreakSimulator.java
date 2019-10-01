package dcp_196_break.simulator;

import java.util.Scanner;

public class DCP_196_BreakSimulator {

    public static void main(String[] args) {
      int u=0,test_case,i;
      double result=0.0,v,t;
      Scanner sc = new Scanner(System.in);
      test_case = sc.nextInt();
      for(i=1;i<=test_case;i++)
      {
      v=sc.nextDouble();
      t=sc.nextDouble();
      result = (u-v)/t;
      System.out.printf("%.2f",result);
      System.out.println();
      
      }
      
      
    }
    
}
