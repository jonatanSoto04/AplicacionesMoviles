package com.reproducircacion;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class ReproducirCacion {

   public static void main(String[] args) {
        // Ruta de la canci�n
        String path = "C:\\Users\\JONATAN SOTO/Documents\\Reproduccion de cacion\\Escombros - La Suprema Corte.wav";

        reproducirCancion(path);

        // Hacer el conteo hasta 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Reproducir la canci�n
    public static void reproducirCancion(String path) {
        try {
            // Cargar el archivo de la canci�n
            File file = new File(path);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            // Crear un clip y abrir la canci�n
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Reproducir la canci�n
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
