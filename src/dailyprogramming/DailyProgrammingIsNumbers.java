/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingIsNumbers
  {

    public static void main(String[] args)
      {
        
        while(true)
          {
            int n = Integer.parseInt(JOptionPane.showInputDialog("").trim());
          System.out.println(isPronic(n));
          }
        
      }

    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    public static boolean isHappy(int n)
      {
        HashSet<Integer> temp = new HashSet<>();

        while (n != 1 && temp.add(n))
          {
            String num = ("" + n);
            int newNum = 0;
            for (int loop = 0; loop < num.length(); loop++)
              {
                newNum += (((int) num.charAt(loop) - 48) 
                        * ((int) num.charAt(loop) - 48));
              }
            n = newNum;
          }
        return n == 1;
      }

    public static boolean isNarcissistic(int n)
      {
        for (int loop = 0, n2 = n, l = ("" + n).length(); loop < l; loop++)
          {
            n -= (int) Math.pow(("" + n2).charAt(loop) - 48, l);
          }
        return (0 == n);
      }

    public static boolean isPerfect(int n)
      {
        int sum = 0;
        for (int loop = 1; loop <= n / 2; loop++)
          {
            sum = (n % loop == 0 ? sum + loop : sum);
          }
        return (n == sum);
      }

    public static boolean isUgly(int n)
      {
        ArrayList<Integer> listOfPrimes = genPrimes(n);
        for (int loop = 0; loop < listOfPrimes.size(); loop++)
          {
            if (n % listOfPrimes.get(loop) == 0 && listOfPrimes.get(loop) != 2 
                 && listOfPrimes.get(loop) != 3 && listOfPrimes.get(loop) != 5)
              {
                return false;
              }
          }
        return true;
      }
    
    public static boolean isHarshad(int n)
      {
        return ((n%addDigits(n))==0);
      }
    
    public static boolean isPronic(int n)
      {
        for(int loop = 0; (loop * loop+1) <= n+1 ;loop++)
            if((loop * (loop+1)) == n)
                return true;
        return false;
      }

    
    
    
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////



    public static int [] intDigitsToArray(int n)
      {
        int [] list = new int [(""+n).length()];
        for(int loop = 0; loop <(""+n).length(); loop++)
            list[loop] = ((""+n).charAt(loop)-48);
        return list;
      }
    
    public static int addDigits(int n)
      {
        int [] temp = intDigitsToArray(n);
        int sum = 0;
        for(int loop = 0; loop < temp.length; loop++)
            sum+=temp[loop];
        return sum;
      }
    
    public static ArrayList<Integer> genPrimes(int n)
      {
        ArrayList<Integer> listOfPrimes = new ArrayList<>(0);
        boolean isPrime;
        for (int loop = 2; loop <= n; loop++)
          {
            isPrime = true;
            int loop2 = 2;
            while (loop2 < loop && isPrime)
              {
                if (loop % loop2 == 0)
                  {
                    isPrime = false;
                  }
                loop2++;
              }
            if (isPrime)
              {
                listOfPrimes.add(loop);
              }
          }
        return listOfPrimes;
      }
  }
