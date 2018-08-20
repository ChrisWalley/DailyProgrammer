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
public class DailyProgrammingNarcissisticNumbers
  {
    public static void main (String [] args)
      {
       for(int count = 0, loop = 0; count <15; loop++)
           if(isNarcissistic(loop))
             {
                 System.out.println(loop);
                 count++;
             }
      }
    
    public static boolean isNarcissistic(int n)
      {
        for(int loop = 0, n2 = n, l = (""+n).length(); loop < l; loop++)
            n -= (int) Math.pow((""+n2).charAt(loop)-48, l);
        return(0==n);
      }
    
  }
