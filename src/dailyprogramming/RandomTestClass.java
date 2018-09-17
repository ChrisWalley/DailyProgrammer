/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class RandomTestClass
  {
    public static void main (String ... args) throws InterruptedException, FileNotFoundException
      {
       for(int loop = 0; loop <100; loop++)
         {
             System.out.println((int) Math.round(Math.random()*5));
         }
          
      }
  }
