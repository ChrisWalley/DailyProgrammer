/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingUglyNumbers
  {

    //An ugly number is one that has only 2, 3 or 5 as its prime factors
    public static void main(String[] args)
      {
        while(true)
        if(isUgly(Integer.parseInt(JOptionPane.showInputDialog("").trim())))
              System.out.println("Ugly");
        else
              System.out.println("Not so Ugly");
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
                    isPrime = false;
                loop2++;
              }
            if (isPrime)
                listOfPrimes.add(loop);
          }
        return listOfPrimes;
      }
    
    public static boolean isUgly(int n)
      {
        ArrayList<Integer> listOfPrimes = genPrimes(n);
        for(int loop = 0; loop < listOfPrimes.size(); loop++)
            if(n%listOfPrimes.get(loop) == 0 && listOfPrimes.get(loop) != 2 && listOfPrimes.get(loop) != 3 && listOfPrimes.get(loop) != 5)
                return false;
        return true;
      }

  }
