/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingLightOn
{
    public static void main (String []args)
    {
        int c, n = 0B0;
        try (Scanner inLine = new Scanner(JOptionPane.showInputDialog("")))
          {
            while(inLine.hasNext())
              {
                int s = inLine.nextInt(), f = inLine.nextInt();
                for(int L = s; L < f; L++)
                    n = n | (1 << L);
              }
            for (c = 0; c < n; c++)
                n &= n - 1;
            System.out.println(c);
            inLine.close();
          }
    }
}
