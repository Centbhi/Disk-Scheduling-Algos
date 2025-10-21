package oslab;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(98, 183, 37, 122, 14, 124, 65, 67));
    public static int head = 53;
    public static int diskSize = 199;

    public static void main( String[] args ){

        System.out.println("Input Array: " + arr);
        System.out.println("Head: " + head);

        FCFS.runAlgo(new ArrayList<>(arr), head);
        SSTF.runAlgo(new ArrayList<>(arr), head);
        SCAN.runAlgo(new ArrayList<>(arr), head, diskSize, true);
        SCAN.runAlgo(new ArrayList<>(arr), head, diskSize, false);
        CSCAN.runAlgo(new ArrayList<>(arr), head, diskSize, true);
        CSCAN.runAlgo(new ArrayList<>(arr), head, diskSize, false);

        // FSCAN.runAlgo(new ArrayList<>(arr), head, diskSize, true);
        // FSCAN.runAlgo(new ArrayList<>(arr), head, diskSize, false);
        // LIFO.runAlgo(new ArrayList<>(arr), head);
    }

}
