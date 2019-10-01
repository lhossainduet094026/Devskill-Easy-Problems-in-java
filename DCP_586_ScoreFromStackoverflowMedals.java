
package dcp_586_score.from.stackoverflow.medals;

import java.util.Scanner;

public class DCP_586_ScoreFromStackoverflowMedals {
public static int calculateScore(int bronze,int silver,int gold)
{
    return (bronze * 10) + (silver * 50) + (gold * 100);
}
    
    public static void main(String[] args) {
        int test_case,i,bronze,silver,gold,score;
        Scanner sc = new Scanner(System.in);
        test_case = sc.nextInt();
        for(i = 1;i<=test_case;i++)
        {
        bronze = sc.nextInt();
        silver = sc.nextInt();
        gold = sc.nextInt();
        score = calculateScore(bronze,silver,gold);
        System.out.println(score);
        }
    }
    
}
