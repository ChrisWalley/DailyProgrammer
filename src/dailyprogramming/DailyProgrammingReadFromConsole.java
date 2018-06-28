/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingReadFromConsole {
    public static void main (String ... args)
    {
        System.out.print("Enter anything: ");
        Scanner s  = new Scanner(System.in);
        System.out.println(s.nextLine());
        s.close();
    }
    
}
