/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingGameOfThrees
{
    public static void main (String...args)
    {
        Stream.iterate(Integer.parseInt(JOptionPane.showInputDialog(null)),
                x->(x%3==0)?x/3:(x%3==2)?(x+1)/3:(x-1)/3)
                .filter((x)->
                {System.out.println(x + " " + (x==1?"":x%3==0?": 0":(x%3==2)?": +1":": -1"));
                return x==1;})
                .findFirst();
    }
}
