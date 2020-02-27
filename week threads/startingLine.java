package week8;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * runnable has two variables used for the building of the car race
 */
public class startingLine implements Runnable {
    /**
     * no arg constructor
     */
       private String name;
       private int distance;

    /**
     * AtomicInteger is used for last 10 laps of race
     */
       private AtomicInteger lastTen = new AtomicInteger(10);


    /**
     * parameterized constructor for car race
     * @param name
     * @param distance
     */
    public startingLine (String name, int distance) {
        this.name = name;
        this.distance = distance;



    }

    /**
     * void run method using to for loops to track the amount of laps for each car
     * the distance is set at 100 laps
     * after a random number lap between 1 and 10 the car takes a pitstop or sleeps
     * the seconds are made into laps
     */
    public void run() {
    Random rand = new Random();


    int  pitStopTime;

    for(int count = 1; count <= distance; count++){

        if(count % 10 == 0 && distance % count != 0){
            pitStopTime = rand.nextInt(7);
            pitStopTime *= 1000;
            System.out.println(this.name +" will be in the pit stop for "
                                + pitStopTime/1000 + " seconds.");
            try{
                Thread.sleep(pitStopTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /**
         * the atomic integer is used here to keep track of the last ten laps of the race
         */
        if((distance - count) < 10){
            System.out.println( "\n" + this.name + " has "  +lastTen.decrementAndGet()
                    + " laps left");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    System.out.println( this.name + " finished the race!");

    }
}
