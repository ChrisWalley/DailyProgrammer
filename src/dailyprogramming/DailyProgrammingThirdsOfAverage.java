/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingThirdsOfAverage
  {

    public static void main(String[] args)
      {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int numPlayers = s.nextInt();
        int average = 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> differences = new ArrayList<>();

        for (int loop = 1; loop <= numPlayers; loop++)
          {
            System.out.println("Enter Player " + loop + "'s number");
            numbers.add(loop - 1, s.nextInt());
            average = average + numbers.get(loop - 1);
          }

        average = average / numPlayers;
        average = average/3*2;

        int closestPlayer = 0;

        for (int loop = 0; loop < numPlayers; loop++)
          {
            differences.add(loop, Math.abs(average - numbers.get(loop)));
            closestPlayer = differences.get(loop) < differences.get(closestPlayer) ? loop : closestPlayer;
          }

        System.out.println();
        System.out.println("2/3rds of average is: "+average);
        System.out.println("The closest player is: "+(closestPlayer+1));
        System.out.println("With the guess of: "+numbers.get(closestPlayer));
      }
  }
