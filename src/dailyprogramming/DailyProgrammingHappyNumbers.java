/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.HashSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingHappyNumbers
  {

    public static void main(String[] args)
      {
        int n = Integer.parseInt(JOptionPane.showInputDialog("").trim());
        for (int loop = 1, count = 0; count < n; loop++)
          {
            if (isHappy(loop))
              {
                System.out.println(loop);
                count++;
              }
          }
      }

    public static boolean isHappy(int n)
      {
        HashSet<Integer> temp = new HashSet<>();

        while (n != 1 && temp.add(n))
          {
            String num = ("" + n);
            int newNum = 0;
            for (int loop = 0; loop < num.length(); loop++)
              {
                newNum += (((int) num.charAt(loop) - 48) * ((int) num.charAt(loop) - 48));
              }
            n = newNum;
          }
        return n == 1;
      }

  }
