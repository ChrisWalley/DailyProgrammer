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
public class DailyProgrammingDerangements
  {

    public static void main(String[] args)
      {
        System.out.println(findDerangement(23));
      }

    public static long findDerangement(long n)
      {
        return (n <= 0 ? 1 : n * (findDerangement(n - 1)) + (n % 2 == 0 ? 1 : -1));
      }
  }
