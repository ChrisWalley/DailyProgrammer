/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingHavelHakimi
  {

    public static void main(String... args)
      {
        int[] list = new int[]
          {
16, 9, 9, 15, 9, 7, 9, 11, 17, 11, 4, 9, 12, 14, 14, 12, 17, 0, 3, 16
          };

        System.out.println((solve(list) ? "True" : "False"));
      }

    public static boolean solve(int[] l)
      {
        ArrayList<Integer> list = new ArrayList<>();

        for (int loop = 0; loop < l.length; loop++)
            list.add(l[loop]);

        while (list.size() > 0)
          {
            for (int loop = 0; loop < list.size(); loop++)
                if (list.get(loop) == 0)
                    list.remove(loop--);
            if (list.isEmpty())
                return true;
            Collections.sort(list, Collections.reverseOrder());
            int N = list.remove(0);
            if (N > list.size())
                return false;
            for (int loop = 0; loop < N; loop++)
                list.set(loop, (list.get(loop) - 1));
          }
        return true;
      }
  }
