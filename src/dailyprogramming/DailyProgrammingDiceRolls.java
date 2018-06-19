/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;
import javax.swing.JOptionPane;

/**
 *
 * @author ChrisWalley
 */
public class DailyProgrammingDiceRolls
{
    public static void main(String ... args)
    {
        
    while(true)
    {
        String list = "", input = JOptionPane.showInputDialog("");
        int n, sum = 0;
        for(int loop = 0; loop < Integer.parseInt(input.substring(0, input.indexOf("d"))); loop++)
        {
            sum += n = (int) (Math.round(Math.random()*(Integer.parseInt(input.substring(input.indexOf("d")+1))-1))+1);
            list = list+n+" ";
        }
        System.out.println(input+"\n"+sum+": "+list);
    }
    }
}
