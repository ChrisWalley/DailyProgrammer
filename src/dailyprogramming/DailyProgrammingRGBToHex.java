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
public class DailyProgrammingRGBToHex
  {
    public static void main (String [] args)
      {
          System.out.println(RGBToHex(255,99,71));
          System.out.println(RGBToHex(184,134,11));
          System.out.println(RGBToHex(189,183,107));
          System.out.println(RGBToHex(0,0,205));
      }
    
    public static String RGBToHex(int r, int g, int b)
      {
       String R = (""+(char)((r/16)>9 ? (r/16)+55 : (r/16)+48)+(char)((r%16)>9 ? (r%16)+55 : (r%16)+48));
       String G = (""+(char)((g/16)>9 ? (g/16)+55 : (g/16)+48)+(char)((g%16)>9 ? (g%16)+55 : (g%16)+48));
       String B = (""+(char)((b/16)>9 ? (b/16)+55 : (b/16)+48)+(char)((b%16)>9 ? (b%16)+55 : (b%16)+48));
       return("#"+R+G+B);
      }
  }
