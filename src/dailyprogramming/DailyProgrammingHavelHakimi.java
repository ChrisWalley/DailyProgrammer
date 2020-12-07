/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingHavelHakimi
  {

    public static void main(String[] args)
      {
        /*
            try
              {
                BufferedReader reader
                        = new BufferedReader(new InputStreamReader(System.in));
                String line = reader.readLine();
                System.out.println(isEven(line));
              } catch (IOException ex)
              {
                Logger.getLogger(DailyProgrammingHavelHakimi.class.getName()).log(Level.SEVERE, null, ex);
              }
         */

        String[] lines =
          {
            "5, 3, 0, 2, 6, 2, 0, 7, 2, 5",
            "4, 2, 0, 1, 5, 0",
            "3, 1, 2, 3, 1, 0",
            "16, 9, 9, 15, 9, 7, 9, 11, 17, 11, 4, 9, 12, 14, 14, 12, 17, 0, 3, 16",
            "14, 10, 17, 13, 4, 8, 6, 7, 13, 13, 17, 18, 8, 17, 2, 14, 6, 4, 7, 12",
            "15, 18, 6, 13, 12, 4, 4, 14, 1, 6, 18, 2, 6, 16, 0, 9, 10, 7, 12, 3",
            "6, 0, 10, 10, 10, 5, 8, 3, 0, 14, 16, 2, 13, 1, 2, 13, 6, 15, 5, 1",
            "2, 2, 0",
            "3, 2, 1",
            "1, 1",
            "1",
            ""
          };
        for (String x : lines)
          {
            System.out.println(x + " -> " + isEven(x));
          }

      }

    public static boolean isEven(String line)
      {

        if (line.equals(""))
          {
            return true;
          }
        String[] lines = line.split(", ");
        ArrayList<Integer> nums = new ArrayList<>();

        for (String x : lines)
                nums.add(Integer.parseInt(x));

        while (true)
          {
            if (nums.isEmpty())
              {
                return true;
              }
            
            for(int loop = 0; loop < nums.size(); loop++)
                if(nums.get(loop)==0)
                  {
                    if(nums.size()==1)
                        return true;
                    
                    nums.remove(loop);
                    loop--;
                  }
            
            int [] intArr = new int[nums.size()];
            
            for(int loop = 0; loop < nums.size(); loop++)
                intArr[loop] = nums.get(loop);
            
            nums = bubbleSort(intArr);
        
            int N = nums.remove(0);

            if (N > nums.size())
              {
                return false;
              }

            for (int loop = 0; loop < N; loop++)
              {
                nums.set(loop, nums.get(loop) - 1);
              }
          }
      }
    
     public static ArrayList<Integer> bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
		int temp = 0;
		
		for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){
				
				if(arr[j-1] < arr[j]){
					//swap the elements!
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i:arr)
            array.add(i);
        
        return array;
    }

  }
