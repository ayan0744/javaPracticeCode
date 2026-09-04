package projects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alramTime;
    private final String filePath;

    private final Scanner scanner;

    AlarmClock(LocalTime alramTime,String filePath, Scanner scanner){
        this.alramTime = alramTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        // LocalTime now = LocalTime.now();

        while (LocalTime.now().isBefore(alramTime)) {
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

//                int hours = now.getHour();
//                int minutes = now.getMinute();
//                int second = now.getSecond();

                // System.out.println(LocalTime.now());

//                System.out.printf("%02d:%02d:%02d\n",hours,minutes,second);
//                System.out.printf("\r%02d:%02d:%02d",hours,minutes,second);
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println("\n*ALARM NOISE*");
        playSound(filePath);
    }
    private void playSound(String filePath){
        File audioFile = new File(filePath);



        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.println("Press *Enter* to stop the alarms");
            scanner.nextLine();
            clip.start();
            scanner.close();
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }
        catch (LineUnavailableException e){
            System.out.println("Audio is unavailable");
        }
        catch (IOException e){
            System.out.println("Error reading audio file");
        }
    }
}
