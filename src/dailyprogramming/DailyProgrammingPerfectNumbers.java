/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingPerfectNumbers
  {
    public static void main (String[]args)
      {
        while(true)
          System.out.println(isPerfect(Integer.parseInt(JOptionPane.showInputDialog("").trim())));
      }
    
    public static boolean isPerfect(int n)
      {
        int sum = 0;
        for(int loop = 1; loop <=n/2; loop++)
            sum = (n%loop==0 ? sum+loop : sum);
        return(n==sum);
      }
  }
