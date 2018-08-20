/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//https://old.reddit.com/r/dailyprogrammer/comments/8eger3/20180423_challenge_358_easy_decipher_the_seven/
package dailyprogramming;

import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingBlockNumbers
{
    public static void main(String...args)
    {
        String [] numbers = {
            " _ | ||_|",//0
            "     |  |",//1
            " _  _||_ ",//2
            " _  _| _|",//3
            "   |_|  |",//4
            " _ |_  _|",//5
            " _ |_ |_|",//6
            " _   |  |",//7
            " _ |_||_|",//8
            " _ |_| _|"//9
        };
        
        String all3Rows = JOptionPane.showInputDialog("Enter all 3 rows");
        
        char [] top = all3Rows.substring(0,27).toCharArray();
        char [] mid = all3Rows.substring(28,55).toCharArray();
        char [] bot = all3Rows.substring(56,83).toCharArray();
        
        for(int loop = 0; loop <top.length;loop+=3)
        {
            String num = ""+top[loop]+top[loop+1]+top[loop+2]+mid[loop]+mid[loop+1]+mid[loop+2]+bot[loop]+bot[loop+1]+bot[loop+2];
            for(int loop2 = 0; loop2 <=9; loop2++)
            {
                if(num.equals(numbers[loop2]))
                {
                    System.out.print(String.valueOf(loop2));
                    break;
                }
            }
        }
    }
}
