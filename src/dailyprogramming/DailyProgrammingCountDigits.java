/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingCountDigits
  {

    public static void main(String[] args)
      {
       // Long N = Long.parseLong(JOptionPane.showInputDialog("").trim());
        Long N = 999999999L;

        long now = 0, sum = 0;
        double combined = 0, string = 0, math = 0;
        double limit = 90000000;
        
        for (int loop = 1; loop <= limit; loop++)
          {
            now = System.currentTimeMillis();
            //System.out.println("Combined: " + findDigits(N));
           // double g = findDigits(N);
            double g = (N < 0) ? (("" + N).length()) : (("" + N).length());
            sum += (System.currentTimeMillis() - now);
          }
        combined = sum / limit;
      
        
        for (int loop = 1; loop <= limit; loop++)
          {
            now = System.currentTimeMillis();
            //System.out.println("Combined: " + findDigits(N));
           // double g = findDigits(N);
            double g = (N < 0) ? (N.toString().length()) : (N.toString().length());
            sum += (System.currentTimeMillis() - now);
          }
        string = sum / limit;
        
          System.out.println("Combined: "+combined + "ms");
          System.out.println("String: "+string + "ms");
      }

    public static int findDigits(long N)
      {
        return (N < 0) ? ((""+N).length()) : ((""+N).length());
      }
  }
