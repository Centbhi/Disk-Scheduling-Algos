package oslab;

public class App {
    public static int arr[] = {1,47,32,86,53};
    public static int head = 2;
    public static int diskSize = 150;

    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        FCFS fcfs = new FCFS();
        fcfs.runAlgo(arr, head);
    }

}
