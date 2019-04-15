/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingFirstRecurringChar
  {
   public static void main (String [] args)
     {
         System.out.println(getFirstRecChar("*l1J?)yn%R[}9~1\"=k7]9;0[$"));
     }

    private static String getFirstRecChar(String V)
      {
        int x = Integer.MAX_VALUE;
        for(int loop = 0; loop <V.length(); loop++) 
            x = (V.substring(loop+1).indexOf(V.charAt(loop)) >-1 
                    && (V.substring(loop+1).indexOf(V.charAt(loop))+1+loop)
                    < x) ? (V.substring(loop+1).indexOf(V.charAt(loop))+1+loop)
                    : x ;
        return (V.charAt(x)+" at index "+V.indexOf(V.charAt(x)));
      }
  }
