package week8;
import java.security.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    /**
     * in the main method we use 4 cars and 4 threadpools
     * each car starts the race at the same time
     * @param args
     */
    public static void main(String[] args) {
	ExecutorService race = Executors.newFixedThreadPool(4);

	    startingLine car = new startingLine("Car1",100);
        startingLine car1 = new startingLine("Car2",100);
        startingLine car2 = new startingLine("Car3",100);
        startingLine car3 = new startingLine("Car4",100);

        race.execute(car);
        race.execute(car1);
        race.execute(car2);
        race.execute(car3);

        race.shutdown();
    }

}
