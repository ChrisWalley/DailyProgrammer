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
public class DailyProgrammingPentagonalNumbers
  {
    public static void main(String [] args)
      {
        for(int n = 1; n <= 50; n++)
              System.out.print((((3*n*n)-n)/2)+" ");
      }
  }
