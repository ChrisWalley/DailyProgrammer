/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingIEC
{
 
    public static void main (String [] args) throws FileNotFoundException 
    {
        /*
        while(true)
        {
            System.out.println(checkString(JOptionPane.showInputDialog("")));
        }*/
        int count = 0;
        Scanner checkFile = new Scanner(new File("wordList.txt"));
        while(checkFile.hasNextLine())
        {
            String s  = checkFile.nextLine();
            if(!checkString(s))
        {
                System.out.println(s);
                count++;
        }
        }
        System.out.println(count);
    }
    
    
    public static boolean checkString(String s)
    {
        if(s.indexOf("ei")==0)
            return false;
            else
            
        return(!(s.contains("ie")&&(s.charAt(s.indexOf("ie")-1)&31)==3)&!((s.contains("ei"))&&(s.charAt(s.indexOf("ei")-1)&31)!=3));
    }

}

/*
        if(s.contains("ie")&&(s.charAt(s.indexOf("ie")-1)&31)==3)
            return false; 
        else if((s.contains("ei"))&&(s.charAt(s.indexOf("ei")-1)&31)!=3)
            return false;
        return true;*/
                //return(!(s.contains("ie")&&(s.charAt(s.indexOf("ie")-1)&31)==3)&!((s.contains("ei"))&&(s.charAt(s.indexOf("ei")-1)&31)!=3));

        