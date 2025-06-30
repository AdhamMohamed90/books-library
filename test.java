/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author DELL
 */
public class test {
    public static void main(String[] args) {
        AudioInputStream a = null;
        try {
            File f = new File("C:\\Users\\DELL\\Desktop\\welcome-64347.wav");
            a = AudioSystem.getAudioInputStream(f);
            Clip c = AudioSystem.getClip();
            
            c.open(a);
            c.start();
            
           
        } catch (UnsupportedAudioFileException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                a.close();
            } catch (IOException ex) {
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
}
