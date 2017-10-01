package nl.paisanrietbroek.hashtable;

import org.joda.time.DateTime;
import java.util.Hashtable;

/**
 * Created by paisanrietbroek on 01/10/2017.
 */
public class SearchTimeCalculator {

    private Hashtable hashtable;

    public SearchTimeCalculator(int amount) {

        this.hashtable = new Hashtable(amount);

        for (int i = 0; i < amount; i++) {
            String value = String.valueOf(Math.random() * 100);

            this.hashtable.put(i, value);
        }

//        System.out.println(this.hashtable.toString());
    }

    public void getSearchTime(int key) {

        DateTime now = DateTime.now();
        Object o = this.hashtable.get(key);
        DateTime after = DateTime.now();

        long searchTime = after.getMillis() - now.getMillis();

        printResults(this.hashtable, key, searchTime);

    }

    public int getRandomKey() {
        return (int) (Math.random() * 100);
    }

    public void printResults(Hashtable h, int key, long searchTime) {
        System.out.println("---------------------");
        System.out.println(key + ": " + hashtable.get(key));
        System.out.println("Size: " + this.hashtable.size());
        System.out.println("Time: " + searchTime);
        System.out.println("---------------------");
    }

}
