package oslab;

import java.util.ArrayList;

public class SCAN {
    void runAlgo(ArrayList<Integer> queue, int headPos, int diskSize, boolean isLeft){
        System.out.println("\nSCAN Algorithm: ");
        queue.sort(null);
        System.out.println("Sorted List: " + queue);
        int totalCost = 0;
        if(isLeft){ //<------
            System.out.print("Head Movement [LEFT]: \n\t" + headPos);
            int splitIndex = 0;
            for (int i = queue.size() - 1; i >= 0; i--) {
                if(queue.get(i) <= headPos){
                    splitIndex = i;
                    break;
                }
            }
            Result firstResult = parseLeft(queue, splitIndex, headPos, totalCost);
            totalCost = firstResult.getTotalCost();

            totalCost += firstResult.getLastVal(); //from last val -> 0, thus cost+=lastval
            headPos = 0;
            System.out.print(" -> " + headPos);

            Result secondResult = parseRight(queue, 0, headPos, totalCost);
            totalCost = secondResult.getTotalCost();

        }else{ //------>
            System.out.print("Head Movement [RIGHT]: \n\t" + headPos);
            int splitIndex = 0;
            for (int i = 0; i < queue.size(); i++) {
                if(queue.get(i) >= headPos){
                    splitIndex = i;
                    break;
                }
            }
            Result firstResult = parseRight(queue, splitIndex, headPos, totalCost);
            totalCost = firstResult.getTotalCost();

            totalCost += Math.abs(diskSize-firstResult.getLastVal()); //from last val -> 0, thus cost+=lastval
            headPos = diskSize;
            System.out.print(" -> " + headPos);

            Result secondResult = parseLeft(queue, queue.size()-1, headPos, totalCost);
            totalCost = secondResult.getTotalCost();
        }
        System.out.println("\nTotal Cost: " + totalCost);
    }

    private Result parseRight(ArrayList<Integer> queue, int index, int headPos, int totalCost){ 
        while(index < queue.size()) {
            totalCost += Math.abs(queue.get(index)-headPos);
            headPos = queue.get(index);
            System.out.print(" -> " + headPos);
            queue.remove(index);
        }
        Result result = new Result(totalCost, headPos);
        return result;
    }

    private Result parseLeft(ArrayList<Integer> queue, int index, int headPos, int totalCost){ 
        while(index >= 0){
            totalCost += Math.abs(queue.get(index)-headPos);
            headPos = queue.get(index);
            System.out.print(" -> " + headPos);
            queue.remove(index);
            index--;
        }
        Result result = new Result(totalCost, headPos);
        return result;
    }
}

class Result{
    int totalCost;
    int lastVal;
    Result(int totalCost, int lastVal) {
        this.totalCost = totalCost;
        this.lastVal = lastVal;
    }
    public int getLastVal() {
        return lastVal;
    }
    public int getTotalCost() {
        return totalCost;
    }
}
