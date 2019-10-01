package dcp_273_vely.easy.problem;

import java.util.Scanner;

public class DCP_273_VelyEasyProblem {

  
    public static void main(String[] args) {
        int test_case,i,j;
        String s;
        boolean flag=false;
        
        Scanner sc = new Scanner(System.in);
        test_case = sc.nextInt();
        for(i =1;i<=test_case;i++)
        {
             s=sc.next();
             char[] c  = s.toCharArray();
             for(j=0;j<c.length;j++)
                {
                    if(c[j]=='r')
                    {
                        flag = true;
                        break;
                    }
                    flag=false;
                }
           if(flag)
            {
               System.out.println("Not vely easy");
            }
           else if(flag==false)
           {
            System.out.println("Vely easy");
           }
        }
        
        }
        
    }
