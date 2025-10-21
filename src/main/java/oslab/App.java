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

        //MP7
        // FCFS.runAlgo(new ArrayList<>(arr), head);
        // SSTF.runAlgo(new ArrayList<>(arr), head);
        // SCAN.runAlgo(new ArrayList<>(arr), head, diskSize, true);
        // SCAN.runAlgo(new ArrayList<>(arr), head, diskSize, false);
        // CSCAN.runAlgo(new ArrayList<>(arr), head, diskSize, true);
        // CSCAN.runAlgo(new ArrayList<>(arr), head, diskSize, false);

        //MP8
        // FSCAN.runAlgo(new ArrayList<>(arr), head, diskSize, true);
        // FSCAN.runAlgo(new ArrayList<>(arr), head, diskSize, false);
        // LIFO.runAlgo(new ArrayList<>(arr), head);
        // RSS.runAlgo(new ArrayList<>(arr), head);
        // CLOOK.runAlgo(new ArrayList<>(arr), head, diskSize, false);
        // CLOOK.runAlgo(new ArrayList<>(arr), head, diskSize, true);
    }

}
