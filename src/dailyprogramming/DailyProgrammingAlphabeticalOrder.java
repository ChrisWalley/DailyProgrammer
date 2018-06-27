/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingAlphabeticalOrder 
{
 public static void main (String [] args)
 {
     String word = JOptionPane.showInputDialog(null).trim().toUpperCase();
     int dir = (word.charAt(0) - word.charAt(1));
     for(int loop = 1; loop< word.length()-1; loop++)
         if(dir*(word.charAt(loop) - word.charAt(loop+1)) < 0)
             dir = 0;
     System.out.println(word+ (dir>0 ? (" IN REVERSE ORDER"):dir==0 ? (" NOT IN ORDER"):(" IN ORDER")));
 }
}
