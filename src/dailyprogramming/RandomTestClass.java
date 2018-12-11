/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.FileNotFoundException;
public class RandomTestClass
  {
    public static void main (String ... args) throws InterruptedException, FileNotFoundException
      {
          System.out.println(emojiFilter("This is a test :joy::fire: cool?"));
      }
    
    public static String emojiFilter(String s)
      {
        String Ejoy = "😂";
        String EmidFing = "🖕";
        String ErollEyes = "🙄";
        String Efire = "🔥";
        
        String joy = ":joy:";
        String midFing = ":midFing:";
        String rollEyes = ":rollEyes:";
        String fire = ":fire:";
        
        if(s.contains(joy))
          {
            s = s.substring(0, s.indexOf(joy)) + Ejoy + s.substring(s.indexOf(joy)+joy.length(), s.length());
          }
        
        return s;
      }
  }
