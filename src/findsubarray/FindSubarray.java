package findsubarray;

import java.util.Arrays;

public class FindSubarray {

    public static void main(String[] args) {
        int []price1 = {1, 9, 8, 7, 19};
        int []price2 = {10, 11, 17, 10, 5, 6, 72};
        int []price3 = {85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94};
        System.out.println(Arrays.toString(price1));
        Search search = new Search();
        Result res1 = search.finder(price1);
        System.out.println(res1);
        System.out.println(Arrays.toString(price2));
        Result res2 = search.finder(price2);
        System.out.println(res2);
        System.out.println(Arrays.toString(price3));
        Result res3 = search.finder(price3);
        System.out.println(res3);
    }
    
}
