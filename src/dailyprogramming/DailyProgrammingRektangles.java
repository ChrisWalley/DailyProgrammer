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
        int wordLength = word.length;
        int squareWidth = width*wordLength-(width-1);
        int squareHeight = height*wordLength-(height-1);
        char [] [] result = new char [squareWidth] [squareHeight];
        int place = 0, dir = 1;
                
        
        for(int yLoop = 0; yLoop <squareHeight; yLoop++)
        {
           for(int xLoop = 0; xLoop <squareWidth; xLoop++)
           {
               System.out.print(word[getPlace(xLoop,yLoop,wordLength-1)]+" ");
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
    public static int getPlace(int x, int y, int wordWidth)
    {
        int place = Math.abs((x+y)-(wordWidth));
        
        if(place>wordWidth)
            place = place%wordWidth;
       // if(x==y && (x+y)%wordWidth==0)
           // place = wordWidth;10
                    
   
       // return (((x+y)/(wordWidth-1))%2==0)? place = wordWidth-1 : (x+y)%(wordWidth-1) ;
       return place;
    }
}
