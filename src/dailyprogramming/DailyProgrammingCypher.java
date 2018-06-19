/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingCypher
{
    public static void main(String...args)
    {
        
    String inputStr = JOptionPane.showInputDialog("").toLowerCase().trim();
    
    char [] cypher = (inputStr.substring(0, inputStr.indexOf(" ")).toCharArray());
    char [] word = (inputStr.substring(inputStr.indexOf(" ")+1, inputStr.length()).toCharArray());
        
    for(int loop = 0; loop < word.length; loop++)
    {
        int charInt = cypher[loop%cypher.length]+word[loop]-97;
        
        if (charInt > 122)
            charInt = charInt - 26;
        else
            if(charInt < 97)
                charInt = charInt + 26;
        char charact = (char) charInt;
        System.out.print(charact);
    }    
    
    String outputStr = JOptionPane.showInputDialog("").toLowerCase().trim();
    
    char [] cypher2 = (outputStr.substring(0, outputStr.indexOf(" ")).toCharArray());
    char [] word2 = (outputStr.substring(outputStr.indexOf(" ")+1, outputStr.length()).toCharArray());
        
    for(int loop = 0; loop < word2.length; loop++)
    {
        int charInt = word2[loop]-cypher2[loop%cypher2.length]+97;
        
        if (charInt > 122)
            charInt = charInt - 26;
        else
            if(charInt < 97)
                charInt = charInt + 26;
        
        char charact = (char) charInt;
        System.out.print(charact);
    }   
    }
}
