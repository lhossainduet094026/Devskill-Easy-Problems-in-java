package dcp_321_change.pkgcase.of.alphabet;

import java.util.Scanner;

public class DCP_321_ChangeCaseOfAlphabet {

    public static void main(String[] args) {
       String s ;
       char[] a ;
       int i;
       Scanner sc = new Scanner(System.in);
       int test_case;
       int j;
       test_case = sc.nextInt();
       for(j=1;j<=test_case;j++)
       {
           s = sc.next();
           a = s.toCharArray();
            for(i=0;i<a.length;i++)
              {
                  if(a[i]>='A' && a[i]<='Z')
                     { 
                      a[i]=(char) (a[i]+32);
                     }
                 else 
                    {
                     a[i]=(char)(a[i]-32);
                     }
                }
         for(i =0;i<a.length;i++)
         {
              System.out.print(a[i]);
          }
         System.out.print("\n");
       }
}
}
