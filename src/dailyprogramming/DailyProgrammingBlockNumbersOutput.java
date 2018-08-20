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
public class DailyProgrammingBlockNumbersOutput
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
        
        String num = (JOptionPane.showInputDialog("Enter a integer"));
        String topRow = "";
        String midRow = "";
        String botRow = "";
        
        for(int loop = 0; loop <num.length();loop++)
        {
            int n = Integer.parseInt(num.substring(loop,loop+1));
            topRow = topRow.concat(numbers[n].substring(0,3));
            midRow = midRow.concat(numbers[n].substring(3,6));
            botRow = botRow.concat(numbers[n].substring(6,9));
        }
        System.out.println(topRow+"\n"+midRow+"\n"+botRow);
    }
}
