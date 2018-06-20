package dailyprogramming;


import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher
 */
public class DailyProgrammingConseqDist
{
 public static void main (String [] args)
 {
     Scanner inLine = new Scanner(JOptionPane.showInputDialog(""));
     int numOfLines = inLine.nextInt(), lengthOfLines = inLine.nextInt();
     
     for(int L1 = 0; L1 < numOfLines; L1++)
     {
         int distance = 0;
         int [] line = new int [lengthOfLines];
         for(int L2 = 0; L2 < lengthOfLines;L2++)
             line[L2] = inLine.nextInt();
         for(int L2 = 0; L2 < lengthOfLines;L2++)
             for(int L3 = 0; L3 < lengthOfLines;L3++)
              if(line[L2]==line[L3]+1)
                distance += Math.abs(L2 - L3);
         System.out.println(distance);
     }
 }
}
