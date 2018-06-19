/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingClosestString
{
    public static void main (String...fuckYoBitch)
    {
        String line = JOptionPane.showInputDialog("");
        
        Scanner inLine = new Scanner(line);
        int numberOfLines = Integer.parseInt(inLine.next());
        
        String [] lines = new String [numberOfLines];
        int [] distances = new int [numberOfLines];
        
        for(int loop = 0; loop < numberOfLines;loop++)
            lines[loop] = inLine.next();
        
        int index = 0;
        
        for(int loop = 0; loop<numberOfLines; loop++)
        {
            int thisLineDistance = 0;
            char [] thisLine = lines[loop].toCharArray();
            
            for(int loop2 = 0; loop2<numberOfLines;loop2++)
            {
                char [] checkLine = lines[loop2].toCharArray();
                thisLineDistance = thisLineDistance + getDistance(thisLine, checkLine);
            }
            distances [loop] = thisLineDistance;
            if(thisLineDistance < distances[index])
                index = loop;
        }
        
        System.out.println(lines[index]);
        
    }
    
    public static int getDistance(char [] s1, char [] s2)
    {
        int dist = 0;
        for(int loop = 0; loop < s2.length; loop++)
            if(s1[loop]!=s2[loop])
                dist++;
        return dist;
    }
}
