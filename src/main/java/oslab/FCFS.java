package oslab;

import java.util.ArrayList;

public class FCFS {
    void runAlgo(ArrayList<Integer> queue, int headPos){
        System.out.println("\nFCFS Algorithm: ");
        int totalCost = 0;
        System.out.print("Head Movement: " + headPos);
        for (int i : queue) {
            totalCost += Math.abs(i-headPos);
            headPos = i;
            System.out.print(" -> " + headPos);
        }
        System.out.println("\nTotal Cost: " + totalCost);
    }
}
