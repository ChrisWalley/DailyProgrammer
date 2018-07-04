/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingTwoStrings 
{
    public static void main (String ... args)
    {
       /* String String1=JOptionPane.showInputDialog("");
        String String2=JOptionPane.showInputDialog("");
        String1=String1.replaceAll(String2,"");
               //ll1=ll1.replaceAll(""+ll1.charAt(lll),"");*/
        //Pattern temp = Pattern.compile(JOptionPane.showInputDialog(""));
        //System.out.println(JOptionPane.showInputDialog("").replaceAll(temp., ""));
        
        String word = JOptionPane.showInputDialog("");
        String temp = JOptionPane.showInputDialog("");
        System.out.println(Pattern.compile(temp).matcher(word).replaceAll("penis"));
        
         /*for(int lll=0;lll<String1.length();lll++)
            if(String2.contains(""+String1.charAt(lll)))*/

    }    
}
