package dcp_535_tweety.string;

import java.util.Scanner;

public class DCP_535_TweetyString {
    public static int getSumAsci(String s)
    {
        int sumAsci=0,i;
        for(i=0;i<s.length();i++)
        {
            sumAsci = sumAsci + (int)s.charAt(i);
        }
        return sumAsci;
    }
    public static void main(String[] args) {
     String s;
     int test_case,i;
     Scanner sc = new Scanner(System.in);
     test_case = sc.nextInt();
     for(i = 1;i<=test_case;i++)
     {
         s = sc.next();
         int sum_of_asci=getSumAsci(s);
         if(sum_of_asci%20==0)
             System.out.println("Yes");
         else
             System.out.println("No");
     }
    }   
}
