package oslab;

public class FCFS {
    void runAlgo(int queue[], int headPos){
        int totalCost = 0;
        System.out.print("Head: " + headPos);
        for (int i : queue) {
            totalCost += Math.abs(i-headPos);
            headPos = i;
            System.out.print(" -> " + headPos);
        }
        System.out.println("\nTotal Cost: " + totalCost);
    }
}
