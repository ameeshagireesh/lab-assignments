package elections;

import java.util.Random;
import java.util.Vector;

public class Vote extends Thread {
    Random rand = new Random(); 
    int max = 750; 
    int min = 100; 
    int v, s;
    Vector vec;

    public Vote(int v, Vector vec) {
        this.v = v;
        this.vec = vec;
    }

    public void run() {
        try {
            while (vec.size() < 240) { 
                System.out.println(this.getName() + " is Voting");
                vec.add(v);

                s = rand.nextInt((max - min) + 1) + min;
                System.out.println(this.getName() + " is sleeping for " + s);
                Thread.sleep(s);
            }

        } catch (InterruptedException e) {
            System.out.println("Voting Exception: " + e);
        }
    }

}