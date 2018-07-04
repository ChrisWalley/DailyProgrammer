/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import javax.swing.JOptionPane;
/**
 *
 * @author ChrisWalley
 */
public class DailyProgrammingKolakoski {

    public static void main(String[] args) {
        int f = Integer.parseInt(JOptionPane.showInputDialog(""));
        int[] s = new int[f];
        int n = 0;

        int c2 = 0;
        int c1 = 0;

        long now = System.currentTimeMillis();

        for (int l = 0; l < f;) {
            if (s[n] != 0) {
                if ((n + 1) % 2 == 0) {
                    for (int loop2 = 0; loop2 < s[n]; loop2++) {
                        s[l] = 2;
                        l++;
                        c2++;
                        if (l >= f) {
                            break;
                        }
                    }
                } else {
                    for (int loop2 = 0; loop2 < s[n]; loop2++) {
                        s[l] = 1;
                        l++;
                        c1++;
                        if (l >= f) {
                            break;
                        }
                    }
                }
                n++;
            } else {
                s[n] = n + 1;
                if ((n + 1) % 2 == 0) {
                    for (int loop2 = 0; loop2 < s[n]; loop2++) {
                        s[l] = 2;
                        l++;
                        c2++;
                        if (l >= f) {
                            break;
                        }
                    }
                } else {
                    for (int loop2 = 0; loop2 < s[n]; loop2++) {
                        s[l] = 1;
                        l++;
                        c1++;
                        if (l >= f) {
                            break;
                        }
                    }
                }
                n++;
            }
        }

        System.out.println(c1 + ":" + c2);
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");
        System.exit(0);
    }
}
