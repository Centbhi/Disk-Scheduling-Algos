package oslab;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,47,32,86,53));
    public static int head = 52;
    public static int diskSize = 150;

    public static void main( String[] args ){

        System.out.println("Input Array: " + arr);
        System.out.println("Head: " + head);

        FCFS fcfs = new FCFS();
        SSTF sstf = new SSTF();
        SCAN scan = new SCAN();
        CSCAN cscan = new CSCAN();

        fcfs.runAlgo(new ArrayList<>(arr), head);
        sstf.runAlgo(new ArrayList<>(arr), head);
        scan.runAlgo(new ArrayList<>(arr), head, diskSize, true);
        scan.runAlgo(new ArrayList<>(arr), head, diskSize, false);
        cscan.runAlgo(new ArrayList<>(arr), head, diskSize, true);
        cscan.runAlgo(new ArrayList<>(arr), head, diskSize, false);
    }

}
