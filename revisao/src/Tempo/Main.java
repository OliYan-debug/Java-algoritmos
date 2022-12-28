package Tempo;

import java.util.Timer;
import java.util.TimerTask;

public class Main {


    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 100;
            @Override
            public void run() {
                if(counter>0){
                    System.out.printf("%s seconds left%n", counter);
                    counter--;

                }
                else if(counter==0) {
                    System.out.println("Processo finalizado com Êxito");
                    timer.cancel();
                }


            }
        };


        timer.scheduleAtFixedRate(task, 0,1000);

        System.out.println("Aff");
    }

}
