package FindSubarray;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindSubarrayTest {
    
    int []price1 = {1, 9, 8, 7, 19};
    int []price2 = {10, 11, 17, 10, 5, 6, 72};
    int []price3 = {85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94};
    Result res1 = new Result(1, 5, 18);
    Result res2 = new Result(5, 7, 67);
    Result res3 = new Result(5, 9, 43);
    Search search = new Search();
   
    @Test
    public void testSearch() {
        System.out.println("testSearch");
        assertEquals(search.finder(price1), res1);
        assertEquals(search.finder(price2), res2);
        assertEquals(search.finder(price3), res3);
    }
}
