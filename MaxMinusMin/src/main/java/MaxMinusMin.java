
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.print.Collation;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        // nums = new ArrayList<>();
        Integer max = Collections.max(nums);
        Integer min = Collections.min(nums);
        return max-min;
    }
        
}

