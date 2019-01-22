/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.Collection;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingPerfectlyBalanced
  {

    public static void main(String[] args)
      {
        while(true)
        System.out.println(isBalancedBonus(JOptionPane.showInputDialog("")));
      }

    public static boolean isBalancedBonus(String s)
      {
        HashMap<Character, Integer> dict = new HashMap<>();

        for (int lp = 0; lp < s.length(); lp++)
          {
            try
              {
                dict.replace(s.charAt(lp), dict.putIfAbsent(s.charAt(lp), 1) + 1);
              } catch (java.lang.NullPointerException ex)
              {
                System.out.println("Added value " + s.charAt(lp));
              }
          }
        Integer[] values = dict.values().toArray(new Integer[0]);
        for (int l = 1; l < values.length; l++)
          {
            if (!values[l].equals(values[l - 1]))
              {
                return false;
              }
          }
        return true;
      }
    
    public static boolean isBalancedBonus2(String s) throws java.lang.NullPointerException
      {
        HashMap<Character, Integer> d = new HashMap<>();

        for (int l = 0; l < s.length(); l++)
                d.replace(s.charAt(l), d.putIfAbsent(s.charAt(l), 1) + 1);
        Integer[] v = d.values().toArray(new Integer[0]);
        for (int l = 1; l < v.length; l++)
            if (!v[l].equals(v[l - 1]))
                return false;
        return true;
      }

    public static boolean isBalanced(String s)
      {
        int [] xy = new int [2];
        for (int lp = 0; lp < s.length(); lp++)
            xy[s.charAt(lp)-120] = xy[s.charAt(lp)-120]+1;
            //xy[s.charAt(lp)=='x' ? 0 : 1] = xy[s.charAt(lp)=='x' ? 0 : 1]+1;
        return xy[0]==xy[1];
      }
  }
