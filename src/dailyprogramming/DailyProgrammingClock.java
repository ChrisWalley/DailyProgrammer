/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogramming;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Christopher
 */
public class DailyProgrammingClock
  {

    public static void main(String... args)
      {
        //arrayToSounds(getTimeAudio("10:30"));
        int prevmin = 99;
        while (true)
          {
            int hour = Integer.parseInt(new SimpleDateFormat(("HH")).format(new Date(System.currentTimeMillis())));
            int min = Integer.parseInt(new SimpleDateFormat(("mm")).format(new Date(System.currentTimeMillis())));
            try
              {
                if (min != prevmin)
                  {
                    System.out.println(hour + ":" + min);
                    arrayToSounds(getTimeAudio(hour + ":" + min));
                    prevmin = min;
                  }
                Thread.sleep(10000);
              } catch (InterruptedException ex)
              {
                Logger.getLogger(DailyProgrammingClock.class.getName()).log(Level.SEVERE, null, ex);
              }
          }

      }

    public static String getTime(String s)
      {
        String[] digs = new String[]
          {
            "", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen", " Twenty"
          };
        String[] tens = new String[]
          {
            " Oh", "", " Twenty", " Thirty", " Fourty", " Fifty"
          };

        int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
        String ampm = (hour > 11 && hour < 24) ? " pm" : " am";
        hour = (hour == 12 || hour == 24) ? 12 : hour % 12;
        int minute = Integer.parseInt(s.substring(s.indexOf(":") + 1, s.length()));

        //return ("It's" + digs[hour] + (minute > 0 ? (" " + ((minute > 9 && minute < 21) ? digs[minute] : tens[minute / 10] + " " + digs[minute % 10])) : "") + " " + ampm);
        return ("It's" + digs[hour] + (minute > 0 ? ((minute > 9 && minute < 21) ? digs[minute] : tens[minute / 10] + digs[minute % 10]) : "") + ampm);
      }

    public static String[] getTimeAudio(String s)
      {
        String[] digs = new String[]
          {
            "", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", " 10", " 11", " 12", " thir teen", " for teen", " fif teen", " six teen", " seven teen", " eight teen", " nine teen", " twen ty"
          };
        String[] tens = new String[]
          {
            " o", "", " twen ty", " thir ty", " for ty", " fif ty"
          };

        int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
        String ampm = (hour > 11 && hour < 24) ? " pm" : " am";
        hour = (hour == 12 || hour == 24) ? 12 : hour % 12;
        int minute = Integer.parseInt(s.substring(s.indexOf(":") + 1, s.length()));

        //return ("It's" + digs[hour] + (minute > 0 ? (" " + ((minute > 9 && minute < 21) ? digs[minute] : tens[minute / 10] + " " + digs[minute % 10])) : "") + " " + ampm);
        return ("its" + digs[hour] + (minute > 0 ? ((minute > 9 && minute < 21) ? digs[minute] : tens[minute / 10] + digs[minute % 10]) : "") + ampm).split(" ");
      }

    private static void playAudioFile(String file)
      {
        String[] voice = new String[]
          {
            "Robot", "ValleyClock"
          };
        try
          {
            File yourFile = new File("audio/" + voice[1] + "/" + file);
            AudioInputStream stream;
            AudioFormat format;
            DataLine.Info info;
            Clip clip;

            stream = AudioSystem.getAudioInputStream(yourFile);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
            while (!clip.isRunning())
              {
                Thread.sleep(10);
              }
            while (clip.isRunning())
              {
                Thread.sleep(10);
              }
            clip.close();
          } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex)
          {
            ex.printStackTrace();
          } catch (InterruptedException ex)
          {
            Logger.getLogger(DailyProgrammingClock.class.getName()).log(Level.SEVERE, null, ex);
          }
      }

    private static void arrayToSounds(String[] s)
      {
        for (String temp1 : s)
          {
            playAudioFile(temp1 + ".wav");
          }
      }

  }
