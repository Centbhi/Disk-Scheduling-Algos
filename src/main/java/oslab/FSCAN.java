package oslab;

import java.util.ArrayList;

public class FSCAN {
    static void runAlgo(ArrayList<Integer> queue, int headPos, int diskSize, boolean isLeft){
        System.out.println("\nFSCAN Algorithm ");
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
            Result res2 = parseRight(queue, 0, res1);
            totalCost = res2.totalCost;

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
            Result res2 = parseLeft(queue,queue.size()-1, res1);
            totalCost = res2.totalCost;
        }
        System.out.println("\nTotal Cost: " + totalCost);
    }

    static Result parseRight(ArrayList<Integer> queue, int index, Result result){
        while(index < queue.size()) {
            result = move(result, queue.get(index));
            queue.remove(index);
        }
        return result;
    }

    static Result parseLeft(ArrayList<Integer> queue, int index, Result result){
        while(index >= 0){
            result = move(result, queue.get(index));
            queue.remove(index);
            index--;
        }
        return result;
    }

    static Result move(Result result, int dest){
        result.totalCost += Math.abs(dest-result.currHead);
        result.currHead = dest;
        System.out.print(" -> " + result.currHead);
        return result;
    }

    private static class Result{
        int totalCost;
        int currHead;
        Result(int totalCost, int currHead) {
            this.totalCost = totalCost;
            this.currHead = currHead;
        }
    }
}

