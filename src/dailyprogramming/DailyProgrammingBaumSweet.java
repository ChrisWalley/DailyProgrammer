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
public class DailyProgrammingBaumSweet
  {
   public static void main (String [] args)
     {
       int n = Integer.parseInt(JOptionPane.showInputDialog("").trim());
       for(int loop = 0; loop <= n; loop++)
             System.out.print(" "+getBaumSweet(loop));

     }

    private static int getBaumSweet(int l1)
      {
        int l = 0;
        String O = l1 == 0 ? "1" : Integer.toBinaryString(l1);
        while((O = O.substring(1)).length()> 0)
            if(O.charAt(0) == '1' && l%2 == 1) return 0;
            else l = (O.charAt(0) == '1' ? 0 : l+1);
        return l > 0 ?(l+1)%2 : 1;
      }

  }
