/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.util.ArrayList;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingCardFlipping
  {

    public static void main(String[] args)
      {
        char[] input = "0100110".toCharArray();
        char[] input2 = "001011011101001001000".toCharArray();
        char[] input3 = "1010010101001011011001011101111".toCharArray();
        char[] input4 = "1101110110000001010111011100110".toCharArray();
        char[] input5 = "010111111111100100101000100110111000101111001001011011000011000".toCharArray();

        solve(input);
        solve(input2);
        solve(input3);
        solve(input4);
        solve(input5);

      }

    public static void solve(char[] input)
      {
        ArrayList<Integer> moves = new ArrayList<>();
        if (solve(input, moves))
          {
            for (Integer i : moves)
              {
                System.out.print(i + " ");
              }
            System.out.println("");
            return;
          }
        System.out.println("no solution");
      }

    public static boolean solve(char[] input, ArrayList<Integer> moves)
      {
        boolean allDots = true;
        for (char c : input)
          {
            if (c != '.')
              {
                allDots = false;
                break;
              }
          }
        if (allDots)
          {
            return true;
          }
        for (int loop = 0; loop < input.length; loop++)
          {
            char c = input[loop];

            if (c == '1')
              {
                moves.add(moves.size(), loop);
                char[] temp = remove(input, loop);
                if (solve(temp, moves))
                  {
                    return true;
                  } else
                  {
                    moves.remove(moves.size() - 1);
                  }
              }
            if (hasIsland(input))
              {
                return false;
              }
          }
        return true;
      }

    public static boolean hasIsland(char[] in)
      {
        for (int loop = 0; loop < in.length; loop++)
          {
            if (in[loop] == '0' && (loop == 0 || in[loop - 1] == '.'))
              {
                boolean island = true;
                for (int loop2 = loop; loop2 < in.length; loop2++)
                  {
                    if (in[loop2] == '.')
                      {
                        break;
                      }
                    if (in[loop2] == '1')
                      {
                        island = false;
                        break;
                      }
                  }
                if (island)
                  {
                    return true;
                  }
              }
          }
        return false;
      }

    public static char[] remove(char[] in, int index)
      {
        in[index] = '.';
        if (index - 1 >= 0)
          {
            if (in[index - 1] == '0')
              {
                in[index - 1] = '1';
              } else if (in[index - 1] == '1')
              {
                in[index - 1] = '0';
              }
          }

        if (index + 1 < in.length)
          {
            if (in[index + 1] == '0')
              {
                in[index + 1] = '1';
              } else if (in[index + 1] == '1')
              {
                in[index + 1] = '0';
              }
          }
        return in;
      }

  }
