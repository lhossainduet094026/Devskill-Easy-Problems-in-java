package dcp_30_count.it;
import java.util.Arrays;
import java.util.Scanner;

public class DCP_30_CountIt {
    public static void frequency(char[] c1)
    {
        char ch = c1[0];
         int count=1;
         int i;
         for(i=1;i<=c1.length-1;i++)
         {
             if(ch==c1[i])
                {
                    count+=1;
                    ch=c1[i];
                }
            else
                {
                     System.out.println(c1[i-1]+" "+Integer.toString(count));
                     count = 1;
                     ch =c1[i];
                }
        }
         System.out.println(c1[i-1]+" "+Integer.toString(count));
    }
    public static void main(String[] args) {
        int test_case,i;
        String s ;
        char[] c1 ;
        Scanner sc = new Scanner(System.in);
        test_case = sc.nextInt();
         for(i=1;i<=test_case;i++)
          {  
             s = sc.next().toLowerCase();
             c1=s.toCharArray();
             Arrays.sort(c1);
             System.out.println("Case "+i+":");
            frequency(c1);   
          }
       }   
    }

