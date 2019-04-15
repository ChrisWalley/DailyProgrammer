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
public class DailyProgammingUPCCheckDigit
  {

    public static int getCheckDigit(String number)
      {
        while (number.length() < 11)
            number = "0" + number;

        int m = ((3*(((int) number.charAt(0)-48) + ((int) number.charAt(2)-48) + ((int) number.charAt(4)-48) + ((int) number.charAt(6)-48) + ((int) number.charAt(8)-48) + ((int) number.charAt(10)-48))) + (((int) number.charAt(1)-48) + ((int) number.charAt(3)-48) + ((int) number.charAt(5)-48) + ((int) number.charAt(7)-48) + ((int) number.charAt(9)-48)))%10;
        return Integer.parseInt(number + (m == 0 ? 0 : 10 - m));
      }
  }
