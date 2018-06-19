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
public class DailyProgrammingRabbits
{
    public static void main(String[] args)
    {
        long [] numberOfFemaleRabbits = new long [97];
        long [] numberOfMaleRabbits = new long [97];
        long deadRabbits = 0;
        long totalRabbits = 0;
        long numberToRuleEarth = 0;
        int monthsPassed = 0;
        
        numberOfMaleRabbits [3] = Long.parseLong(JOptionPane.showInputDialog("Please enter number of starting male rabbits"));
        numberOfFemaleRabbits [3] = Long.parseLong(JOptionPane.showInputDialog("Please enter number of starting female rabbits"));
        numberToRuleEarth = Long.parseLong(JOptionPane.showInputDialog("Please enter the number of rabbits needed"));
        
        while(totalRabbits < numberToRuleEarth)
        {
            totalRabbits = 0;
            for(int loop = 5; loop <96;loop++)
            {
                numberOfFemaleRabbits[0] = numberOfFemaleRabbits[0]+numberOfFemaleRabbits[loop]*9;
                numberOfMaleRabbits[0] = numberOfMaleRabbits[0]+numberOfFemaleRabbits[loop]*5;                
            }
            
            deadRabbits = numberOfFemaleRabbits[96]+numberOfMaleRabbits[96];
            
            for(int loop = 96; loop >0;loop--)
            {
                numberOfFemaleRabbits[loop] = numberOfFemaleRabbits[loop-1];
                numberOfMaleRabbits[loop] = numberOfMaleRabbits[loop-1];
                numberOfFemaleRabbits[loop-1] = 0;
                numberOfMaleRabbits[loop-1] = 0;
                totalRabbits = totalRabbits+numberOfFemaleRabbits[loop]+numberOfMaleRabbits[loop];
            }
            monthsPassed++;
        }
        
        System.out.println("Months Passed: "+monthsPassed);
        System.out.println("Dead Rabbits: "+deadRabbits);
        System.out.println("Number of living rabbits:"+totalRabbits);
    }
}
