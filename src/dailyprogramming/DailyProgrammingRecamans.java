/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingRecamans 
{
 /*   
 public static void main (String []l0ll)
 {
     /*IgNorE ThIs Line ItS JuSt A WhOle LOt Of CoMmeNtS AnD WoRdS JuSt To MaKe SOmE SpaCe I DoNt LiKe EmpTy SpAcEs So I PrEfErTo FIll ThEm Up WiTh cAmelCasE raNdoM WordSOh LoOk hEre ComEs AVariAblE*/boolean fa1se = true;/*oH AnD TheRe It GoEs*/
     /*HashMap <Integer, Integer> l101 = new HashMap<>(); 
     int l010 = 0001, l0l0 = 0000, ll01, l10l = l010;   
     l101.put(l0l0, l0l0);
     while(fa1se)
     {
         ll01 = Integer.parseInt(JOptionPane.showInputDialog(l0ll));
         for(;l010<=ll01;l010++)
         l101.put(l010,((l101.containsValue(l101.get(l010-l10l)-l010)||(l101.get(l010-l10l)-l010)<l0l0)?(l101.get(l010-l10l)+l010):(l101.get(l010-l10l)-l010)));
         System.out.println(l101.get(ll01));
     }
}*/
 //Readable version
 public static void main(String []args)
 {
     HashMap <Integer, Integer> lookUp = new HashMap<>(); 
     int depth = 1, number;   
     lookUp.put(0, 0);
     while(true)
     {
         number = Integer.parseInt(JOptionPane.showInputDialog(null));
         for(;depth<=number;depth++)
            lookUp.put(depth, ((lookUp.containsValue(lookUp.get(depth-1)-depth) || (lookUp.get(depth-1)-depth)<0) ? (lookUp.get(depth-1)+depth) : (lookUp.get(depth-1)-depth)));
         System.out.println(lookUp.get(number));
     }
 }
}
