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
    public static void main(String[]args)
      {
        int startingAmount = Integer.parseInt(JOptionPane.showInputDialog("Please enter your starting amount (Capital)"));
        int startingBet = Integer.parseInt(JOptionPane.showInputDialog("Please enter your starting bet"));
        int finalAmount = Integer.parseInt(JOptionPane.showInputDialog("Please enter your desired winnings (total - capital)"));
        
        int count = 0;
        
        int pocket = startingAmount;
        int bet = startingBet;
        
        while((pocket<= finalAmount)&&(pocket>0))
          {       
            double roll = (Math.random()*2);
            if(roll <1)
              {
                pocket = pocket+(2*bet);
                bet = startingBet;
              }
            else
                if(roll >=1)
                  {
                    pocket = pocket-bet;
                    bet = bet*2;
                  }
            count++;
          }
          System.out.println("You made: " + (pocket-startingAmount) + " in " + count + " rolls");
        
      }
  }
