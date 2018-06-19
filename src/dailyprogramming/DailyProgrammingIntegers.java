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
public class DailyProgrammingIntegers
{
  public static void main (String...args)
  {
      long A = Long.parseLong(JOptionPane.showInputDialog(""));
      long B = 1;
      long C = A;
      long sum = A;
      long timeNow = System.currentTimeMillis();
      do
              {
                if(A%B == 0)
                {
                    C = A/B;
                    if(B+C<sum)
                        sum = B+C;
                }
                B++;
              }
      while(B<C);
      System.out.println(sum);
      System.out.println((System.currentTimeMillis()-timeNow));
  }
}
