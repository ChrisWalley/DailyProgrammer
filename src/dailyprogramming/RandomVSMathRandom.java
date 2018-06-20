/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Christopher
 */
public class RandomVSMathRandom 
{
    public static void main(String ...args) throws IOException
    {
        Random generator = new Random(); 
        int [] MathRandom = new int [10001];
        int [] Random = new int [10001];
        for(int loop = 0; loop <100000000; loop++)
        {
            int num = (int) (Math.round(Math.random()*10000));
            MathRandom[num]++;
            
            num = (generator.nextInt(10000));
            Random[num]++;
        }
        PrintWriter writeFile = new PrintWriter(new FileWriter("List.csv", false));
        for(int loop = 1; loop <=10000; loop++)
        {
            writeFile.print("\n"+loop+","+MathRandom[loop-1]+","+Random[loop-1]+";");
        }
        writeFile.close();
    }
}
