package dailyprogramming;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher
 */
public class DailyProgrammingRouteCypher
{
    public static void main (String []args)
    {
       String input = JOptionPane.showInputDialog("");
        
       char [] inputString = input.substring(input.indexOf("\"")+1, input.lastIndexOf("\"")).replaceAll("[^a-zA-Z0-9]", "").toUpperCase().toCharArray();
 
       Scanner inLine = new Scanner(input.substring(input.indexOf("(")+1,input.indexOf(")"))).useDelimiter(", ");
      
       int dim1 = inLine.nextInt();
       int dim2 = inLine.nextInt();
       
       String direction = input.substring(input.indexOf(")")+2);
       
       char [] [] rectangle = new char [dim1][dim2];
       
       int X = 0;
       int Y = 0;
       
       for(int loop = 0; loop <dim1*dim2; loop++)
        {
            if(loop < inputString.length)
            rectangle [X][Y] = inputString[loop];
            else
                rectangle [X][Y] = 'X';
            X++;
            if(X>dim1-1)
            {
                X = 0;
                Y++;
            }
        }
       
       int xMax = dim1-1;
       int yMax = dim2-1;
       int xMin = 0;
       int yMin = 0;
       String encoded = "";
       
       if(direction.equalsIgnoreCase("clockwise"))
       while(encoded.length()<=dim1*dim2)
       {
           for(int loop = yMin; loop <=yMax; loop++)
               encoded = encoded+rectangle[xMax][loop];
           xMax--;
           if(encoded.length()>=(dim1*dim2))
                   break;
           for(int loop = xMax; loop >=xMin; loop--)
               encoded = encoded+rectangle[loop][yMax];
           yMax--;
           if(encoded.length()>=(dim1*dim2))
                   break;
           for(int loop = yMax; loop >=yMin; loop--)
               encoded = encoded+rectangle[xMin][loop];
           xMin++;
           if(encoded.length()>=(dim1*dim2))
                   break;
           for(int loop = xMin; loop <=xMax; loop++)
               encoded = encoded+rectangle[loop][yMin];
           yMin++;
       }
       else
       while(encoded.length()<=dim1*dim2)
       {
           for(int loop = xMax; loop >=xMin; loop--)
               encoded = encoded+rectangle[loop][yMin];
           yMin++;
           if(encoded.length()>=(dim1*dim2))
                   break;
           for(int loop = yMin; loop <=yMax; loop++)
               encoded = encoded+rectangle[xMin][loop];
           xMin++;
           if(encoded.length()>=(dim1*dim2))
                   break;
           for(int loop = xMin; loop <=xMax; loop++)
               encoded = encoded+rectangle[loop][yMax];
           yMax--;
           if(encoded.length()>=(dim1*dim2))
                   break;
           for(int loop = yMax; loop >=yMin; loop--)
               encoded = encoded+rectangle[xMax][loop];
           xMax--;
       }  
        System.out.println(inputString);
        System.out.println(dim1+" x "+dim2);
        System.out.println(direction);
        System.out.println(encoded);
       
    }
}
