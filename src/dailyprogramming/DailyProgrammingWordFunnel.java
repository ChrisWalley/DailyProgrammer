/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingWordFunnel
  {

    public static void main(String[] args)
      {
        
        ArrayList <String> list = readFromTxt("enable1.txt");
        ArrayList <String> topWords = new ArrayList<>(0);
        int bestWords = 5;
        
        for(int loop = 0; loop < list.size(); loop++)
          {
            if(getNumberFromCompareStringToList(list.get(loop), list) == 5)
              {
                  topWords.add(list.get(loop));
              }
          }
          System.out.println("Best words: "+bestWords);
          System.out.println("Words: "+topWords);
        
      }

    public static boolean isOneLetterAway(String Jason, String Roger)
      {
        int Larry = 0;
        if ((Jason.length() - 1) == (Roger.length()))
            for (int Greg = 0; (Greg <= Roger.length()) && (Larry < 2); Greg++)
                Larry = ((Larry == 0 && Greg == Jason.length() - 1) || !(Jason.charAt(Greg) == Roger.charAt(Greg - Larry))) ? Larry + 1 : Larry;
        return (Larry == 1);
      }

    public static ArrayList<String> compareStringToList(String s1, ArrayList<String> dict)
      {
        ArrayList<String> list = new ArrayList<>(0);
        for (int loop = 0; loop < dict.size(); loop++)
          {
            if (isOneLetterAway(s1, dict.get(loop)) && !list.contains(dict.get(loop)))
              {
                list.add(dict.get(loop));
              }
          }
        return list;
      }
    
    public static int getNumberFromCompareStringToList(String s1, ArrayList<String> dict)
      {
        int i = 0;
        for (int loop = 0; loop < dict.size(); loop++)
          {
            if (isOneLetterAway(s1, dict.get(loop)))
              {
                i++;
              }
          }
        return i;
      }

    public static ArrayList<String> readFromTxt(String name)
      {
        ArrayList<String> list = new ArrayList<>();
        try
          {
            Scanner readFile = new Scanner(new File(name));
            while (readFile.hasNext())
              {
                list.add(readFile.next());
              }

          } catch (FileNotFoundException ex)
          {
            Logger.getLogger(DailyProgrammingWordFunnel.class.getName()).log(Level.SEVERE, null, ex);
          }
        return list;
      }

  }
