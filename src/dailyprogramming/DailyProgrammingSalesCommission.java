/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.text.DefaultEditorKit;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingSalesCommission
  {
    public static void main(String [] args) throws FileNotFoundException
      {
        
        ArrayList<String> names = new ArrayList<>();
        
        Scanner scanFile = new Scanner(new File("Revenue.txt"));
        Scanner inLine = new Scanner(scanFile.nextLine().trim());
        while(inLine.hasNext())
            names.add(inLine.next());
        int count = 0;
        while(scanFile.hasNextLine())
          {
            int inRow = 0;
            int [] tempRow = new int [names.size()];
            inLine = new Scanner(scanFile.nextLine().trim());
            while(inLine.hasNext())
              {
                tempRow[inRow] = inLine.nextInt();
                inRow++;
              }
            
            count++;
          }
        int [] [] revenue = new int [count] [names.size()];

      }
  }
