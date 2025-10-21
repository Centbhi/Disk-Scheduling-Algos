package oslab;

import java.util.ArrayList;
import java.util.Collections;

public class LIFO {
    static void runAlgo(ArrayList<Integer> queue, int headPos){
        System.out.println("\nLIFO Algorithm ");
        int totalCost = 0;
        System.out.print("Head Movement: \n\t" + headPos);
        Collections.reverse(queue);
        for (int i : queue) {
            totalCost += Math.abs(i-headPos);
            headPos = i;
            System.out.print(" -> " + headPos);
        }
        System.out.println("\nTotal Cost: " + totalCost);
    }
}
