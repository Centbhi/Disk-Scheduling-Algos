package oslab;

import java.util.ArrayList;

public class CSCAN {
    void runAlgo(ArrayList<Integer> queue, int headPos, int diskSize, boolean isLeft){

        System.out.println("\nCSCAN Algorithm: ");

        queue.sort(null);
        System.out.println("Sorted List: " + queue);
        int totalCost = 0;
        Result init = new Result(totalCost, headPos);

        if(isLeft){ //<------
            System.out.print("Head Movement [LEFT]: \n\t" + headPos);

            int splitIndex = 0;
            for (int i = queue.size() - 1; i >= 0; i--) {
                if(queue.get(i) <= headPos){
                    splitIndex = i;
                    break;
                }
            }

            Result res1 = parseLeft(queue, splitIndex, init);
            Result res2 = move(res1,0);
            Result res3 = move(res2,diskSize);
            Result res4 = parseLeft(queue, queue.size()-1, res3);

            totalCost = res4.totalCost;
        }else{ //------>
            System.out.print("Head Movement [RIGHT]: \n\t" + headPos);
            int splitIndex = 0;
            for (int i = 0; i < queue.size(); i++) {
                if(queue.get(i) >= headPos){
                    splitIndex = i;
                    break;
                }
            }

            Result res1 = parseRight(queue, splitIndex, init);
            Result res2 = move(res1,diskSize);
            Result res3 = move(res2,0);
            Result res4 = parseRight(queue, 0, res3);

            totalCost = res4.totalCost;
        }
        System.out.println("\nTotal Cost: " + totalCost);
    }

    private Result parseRight(ArrayList<Integer> queue, int index, Result result){
        while(index < queue.size()) {
            result = move(result, queue.get(index));
            queue.remove(index);
        }
        return result;
    }

    private Result parseLeft(ArrayList<Integer> queue, int index, Result result){
        while(index >= 0){
            result = move(result, queue.get(index));
            queue.remove(index);
            index--;
        }
        return result;
    }

    private Result move(Result result, int dest){
        result.totalCost += Math.abs(dest-result.currHead);
        result.currHead = dest;
        System.out.print(" -> " + result.currHead);
        return result;
    }

    private class Result{
        int totalCost;
        int currHead;
        Result(int totalCost, int currHead) {
            this.totalCost = totalCost;
            this.currHead = currHead;
        }
    }
}

