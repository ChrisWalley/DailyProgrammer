/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingTally
{
    public static void main (String...args)
    {
        char [] line = JOptionPane.showInputDialog("").toCharArray();
       
        String players = "";
        
        for(int loop = 0;loop <26;loop++)
            if(Arrays.toString(line).toUpperCase().indexOf(loop+65)!=(-1))
                players = (players+(char)(loop+65));
        
        int [] score = new int [players.length()];

        for(int loop = 0; loop <line.length; loop++)
            if((int)(line[loop]) < 91)
                score [(line[loop] & 31)-1] = (score [(line[loop] & 31)-1]-1);
        else
                score [(line[loop] & 31)-1] = (score [(line[loop] & 31)-1]+1);
        
        System.out.println(players+"\n"+Arrays.toString(score));
    }
}
