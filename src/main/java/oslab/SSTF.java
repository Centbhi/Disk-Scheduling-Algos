package oslab;

import java.util.ArrayList;

public class SSTF {
    static void runAlgo(ArrayList<Integer> queue, int headPos){
        System.out.println("\nSSTF Algorithm ");
        int totalCost = 0;
        System.out.print("Head Movement: \n\t" + headPos);

        while(!queue.isEmpty()){
            int lowestDiff = Integer.MAX_VALUE;
            int lowestIndex = 0;

            for (int i=0; i < queue.size(); i++){
                int diff = Math.abs(queue.get(i)-headPos);
                if(diff < lowestDiff){
                    lowestDiff = diff;
                    lowestIndex = i;
                }
            }
            
            totalCost += Math.abs(queue.get(lowestIndex)-headPos);

            headPos = queue.get(lowestIndex);
            queue.remove(lowestIndex);

            System.out.print(" -> " + headPos);
        }
        
        System.out.println("\nTotal Cost: " + totalCost);
    }
}
