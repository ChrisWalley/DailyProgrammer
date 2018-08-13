/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class RouletteSim
  {

    public static void main(String... args)
      {
        int startingAmount = Integer.parseInt(JOptionPane.showInputDialog("Please enter your starting amount (Capital)"));
        int startingBet = Integer.parseInt(JOptionPane.showInputDialog("Please enter your starting bet"));
        int finalAmount = Integer.parseInt(JOptionPane.showInputDialog("Please enter your desired winnings (total to leave with)"));
        int simTimes = Integer.parseInt(JOptionPane.showInputDialog("How many times do you want to run the simulation?"));
        int wins = 0;
        int loses = 0;

        for (int loop = 0; loop < simTimes; loop++)
          {
            if (roll(startingAmount, startingBet, finalAmount))
                wins++;
            else
                loses++;
          }
        
          System.out.println(wins+"/"+loses);
      }

    public static boolean roll(int startingCash, int startBet, int endCash)
      {
        int startingAmount = startingCash;//Integer.parseInt(JOptionPane.showInputDialog("Please enter your starting amount (Capital)"));
        int startingBet = startBet;//Integer.parseInt(JOptionPane.showInputDialog("Please enter your starting bet"));
        int finalAmount = endCash;//Integer.parseInt(JOptionPane.showInputDialog("Please enter your desired winnings (total to leave with)"));

        int won = 0;
        int lost = 0;

        int count = 0;

        int pocket = startingAmount;
        int bet = startingBet;

        while ((pocket <= finalAmount) && (pocket - bet > 0))
          {
            int roll = (int) Math.round(Math.random() * 100);
            System.out.println("The ball landed on number " + roll + (roll % 2 == 0 ? " Black" : " Red"));
            if (roll % 2 == 0 && roll != 0)
              {
                pocket = pocket + (2 * bet);
                //System.out.println("Won with "+bet+" bet");
                bet = startingBet;
                won++;
              } else if (roll >= 1)
              {
                pocket = pocket - bet;
                //System.out.println("Lost with "+bet+" bet");
                bet = bet * 2;
                lost++;
              }
            count++;
          }
        System.out.println("You made: " + (pocket - startingAmount) + " in " + count + " rolls\n Your final amount is R" + pocket + "\nYou won " + won + " round and lost " + lost + " rounds");

        if ((pocket - startingAmount) < 0)
          {
            return false;
          } else
          {
            return true;
          }

      }
  }
