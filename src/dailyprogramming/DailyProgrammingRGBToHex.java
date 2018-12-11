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

    public static void main(String[] args)
      {
        System.out.println(blendHex(new String[]
          {
            "#000000", "#778899"
          }));
      }

    public static String RGBToHex(int r, int g, int b)
      {
        String R = ("" + (char) ((r / 16) > 9 ? (r / 16) + 55 : (r / 16) + 48) + (char) ((r % 16) > 9 ? (r % 16) + 55 : (r % 16) + 48));
        String G = ("" + (char) ((g / 16) > 9 ? (g / 16) + 55 : (g / 16) + 48) + (char) ((g % 16) > 9 ? (g % 16) + 55 : (g % 16) + 48));
        String B = ("" + (char) ((b / 16) > 9 ? (b / 16) + 55 : (b / 16) + 48) + (char) ((b % 16) > 9 ? (b % 16) + 55 : (b % 16) + 48));
        return ("#" + R + G + B);
      }

    public static String RGBToHex(int[] RGB)
      {
        String R = ("" + (char) ((RGB[0] / 16) > 9 ? (RGB[0] / 16) + 55 : (RGB[0] / 16) + 48) + (char) ((RGB[0] % 16) > 9 ? (RGB[0] % 16) + 55 : (RGB[0] % 16) + 48));
        String G = ("" + (char) ((RGB[1] / 16) > 9 ? (RGB[1] / 16) + 55 : (RGB[1] / 16) + 48) + (char) ((RGB[1] % 16) > 9 ? (RGB[1] % 16) + 55 : (RGB[1] % 16) + 48));
        String B = ("" + (char) ((RGB[2] / 16) > 9 ? (RGB[2] / 16) + 55 : (RGB[2] / 16) + 48) + (char) ((RGB[2] % 16) > 9 ? (RGB[2] % 16) + 55 : (RGB[2] % 16) + 48));
        return ("#" + R + G + B);
      }

    public static int[] HexToRGB(String hex)
      {
        int R = ((int) hex.charAt(1) - ((int) hex.charAt(1) > 58 ? 55 : 48)) * 16 + ((int) hex.charAt(2) - ((int) hex.charAt(2) > 58 ? 55 : 48));
        int G = ((int) hex.charAt(3) - ((int) hex.charAt(3) > 58 ? 55 : 48)) * 16 + ((int) hex.charAt(4) - ((int) hex.charAt(4) > 58 ? 55 : 48));
        int B = ((int) hex.charAt(5) - ((int) hex.charAt(5) > 58 ? 55 : 48)) * 16 + ((int) hex.charAt(6) - ((int) hex.charAt(6) > 58 ? 55 : 48));

        return new int[]
          {
            R, G, B
          };
      }

    public static String blendHex(String[] vals)
      {
        int[] RGB = new int[3];
        for (String val : vals)
          {
            int[] RGBVals = HexToRGB(val);
            RGB[0] = RGB[0] + RGBVals[0];
            RGB[1] = RGB[1] + RGBVals[1];
            RGB[2] = RGB[2] + RGBVals[2];
          }
        RGB[0] = RGB[0] / vals.length;
        RGB[1] = RGB[1] / vals.length;
        RGB[2] = RGB[2] / vals.length;

        return RGBToHex(RGB);
      }
  }
