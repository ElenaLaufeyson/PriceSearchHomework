package findsubarray;

class Result {
    
    private int leftIndex, rightIndex, sum;

    public Result(int leftIndex, int rightIndex, int sum) {
        this.leftIndex = leftIndex;
        this.rightIndex = rightIndex;
        this.sum = sum;
    }

    public int getLeftBorder() {
        return leftIndex;
    }

    public int getRightBorder() {
        return rightIndex;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        String s = "buyDay = " + leftIndex + ";  saleDay = " + 
                rightIndex + "; benefit = " + sum;
        return s;
    }
    
    
    
}

public class Search {
    
    Result finder(int []price) {
        int []delta = new int [price.length-1];
        for (int i=0;i<price.length-1;i++) {
            delta[i] = price[i+1] - price[i];
        }
        int leftIndex = 0;
        int rightIndex = 0;
        int nowSum = delta[0];
        int maxSum = delta[0];
        int nowRightIndex = 0;
               
        for (int i=1;i<delta.length;i++) {
            nowSum += delta[i];
            if (nowSum < delta[i]) {
                nowSum = delta[i];
                nowRightIndex = i;
            }
            if (maxSum <  nowSum) {
                leftIndex = nowRightIndex;
                rightIndex = i;
                maxSum = nowSum;
            }
        }
        return new Result(leftIndex+1, rightIndex+2, maxSum);
    }
    
}
