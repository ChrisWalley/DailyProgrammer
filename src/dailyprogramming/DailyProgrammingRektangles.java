package dailyprogramming;


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
public class DailyProgrammingRektangles 
{
    public static void main (String ... args)
    {
        String input = JOptionPane.showInputDialog(null);
        int width = Integer.parseInt(input.substring(input.indexOf("h=")+2, input.indexOf(", height")));
        int height = Integer.parseInt(input.substring(input.indexOf("t=")+2));
        char [] word = input.substring(input.indexOf("\"")+1, input.indexOf("\",")).toCharArray();
        int place = 0, dir = 1;
                
        
        for(int loop1 = 0; loop1 <(word.length*height)-(height-1); loop1++)
        {
           for(int loop2 = 0; loop2 <(word.length*width)-(width-1); loop2++)
           {
               System.out.print(word[getPlace(loop1, loop2, word.length-1,(width%2==0))]);
           }
            System.out.println("");
        }
        
        /*
        for(int loopx = 0; loopx <height; height--)
        {
            int widthVal = width;
        for(int loop = 0; loop <widthVal; widthVal--)
        {
            place = (widthVal%2!=0 ? 0 : word.length-1);
            dir = (widthVal%2!=0 ? 1 : -1);
            for(int loop2 = 0; loop2 < word.length-1; loop2++)
            {
                System.out.print(word[place+loop2*dir]);   
            }
        }
         System.out.print(word[place+(word.length-1)*dir]);
            System.out.println("");
        }*/

    }
    public static int getPlace(int x, int y, int wordWidth, boolean isEven)
    {
        int place = (x+y)%(wordWidth);
        if(!isEven)
        if((((x+y)/(wordWidth))%2!=0) && ((x+y)>= wordWidth))
            place = wordWidth;
        else
        if((((x+y)/(wordWidth))%2!=0))
            place = wordWidth;
 
       // return (((x+y)/(wordWidth-1))%2==0)? place = wordWidth-1 : (x+y)%(wordWidth-1) ;
       return place;
    }
}
