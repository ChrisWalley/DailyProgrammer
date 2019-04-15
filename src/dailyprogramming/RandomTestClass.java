/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RandomTestClass
  {

    public static void main(String... args) throws InterruptedException, FileNotFoundException
      {
        ArrayList<temp> tempList = new ArrayList<>();
        temp t = new temp(2);
        temp2 t2 = new temp2(2);
        tempList.add(t);
        tempList.add(t2);
          System.out.println();
          
          temp t3 = tempList.get(0);
          temp t4 = tempList.get(1);
          
          if(t4.getClass() == temp2.class)
            {
                System.out.println("YEs");
            }
      }

  }

class temp
  {

    private int index;

    public temp(int i)
      {
        index = i;
      }

    public int getIndex()
      {
        return index;
      }
  }

class temp2 extends temp
  {

    public temp2(int i)
      {
        super(i);
      }
  }
