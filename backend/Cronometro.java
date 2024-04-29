package backend;

import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {
    public static final int INTERVALO = 1000; // Intervalo de 1 segundo
    public int segundos = 0;
    public Timer timer;

    public Cronometro() {
        timer = new Timer();
        segundos = 0;
    }

    public void comenzarCronometro() {
        timer = new Timer();
        TimerTask tarea = new TimerTask() {
            public void run() {
                segundos++;
            }
        };

        // Programar la tarea para que se ejecute cada segundo
        timer.scheduleAtFixedRate(tarea, 0, INTERVALO);
    }

    public void detenerCronometro() {
        // Detener el cronómetro
        timer.cancel();
        segundos = 0;
    }
}