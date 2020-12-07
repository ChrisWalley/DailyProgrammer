/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingYahtzeeScoring
  {

    public static void main(String[] args) throws FileNotFoundException
      {
        int[] list = new int[]
          {
            2, 3, 5, 5, 6
          };
        System.out.println(getMax(list));
        System.out.println(getMaxRead(new File("yahtzee-upper-1.txt")));
      }

    public static int getMax(int[] rolls)
      {
        HashMap<Integer, Integer> dict = new HashMap<>();

        int max = 0;
        for (int i : rolls)
          {
            dict.put(i, ((dict.get(i) == null) ? 1 : dict.get(i) + 1));
            max = (dict.get(i) * i > max ? dict.get(i) * i : max);
          }

        return max;
      }

    public static int getMaxRead(File f) throws FileNotFoundException
      {
        HashMap<Integer, Integer> d = new HashMap<>();
        int m = 0;
        Scanner s = new Scanner(f);

        while (s.hasNext())
          {
            int i = s.nextInt();
            d.put(i, ((d.get(i) == null) ? 1 : d.get(i) + 1));
            m = (d.get(i) * i > m ? d.get(i) * i : m);
          }
        
        s.close();
        return m;
      }
  }
