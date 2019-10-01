package dcp_476_submission.verdict;

import java.util.Scanner;

public class DCP_476_SubmissionVerdict {

    public static void main(String[] args) {
        int i,test_case;
        String short_format;
        Scanner sc = new Scanner(System.in);
        test_case = sc.nextInt();
        for(i = 1;i<=test_case;i++)
        {
            short_format = sc.next();
            if(short_format.equals("ac"))
            {
                 System.out.println("Accepted");
            }
            else if(short_format.equals("wa"))
            {
                  System.out.println("Wrong Answer");
            }
            else if(short_format.equals("rte"))
            {
                  System.out.println("Run Time Error");
            }
            else if(short_format.equals("tle"))
            {
                  System.out.println("Time Limit Exceeded");
            }
        }
    }
    
}
