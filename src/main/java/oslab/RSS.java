package oslab;

import java.util.ArrayList;
import java.util.Random;

public class RSS {
    static void runAlgo(ArrayList<Integer> queue, int headPos){
        System.out.println("\nRSS Algorithm ");
        int totalCost = 0;
        System.out.print("Head Movement: \n\t" + headPos);
        Random rand = new Random();
        int index;
        while(!queue.isEmpty()){
            index = rand.nextInt(queue.size());
            totalCost += Math.abs(queue.get(index)-headPos);
            headPos = queue.get(index);
            System.out.print(" -> " + headPos);
            queue.remove(index);
        }
        System.out.println("\nTotal Cost: " + totalCost);
    }
}
