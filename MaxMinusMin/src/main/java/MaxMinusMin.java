
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
        nums = new ArrayList<>();
        
        if(nums==null || nums.size()==0){
            return Integer.MIN_VALUE;
        }
        List<Integer>newList = new ArrayList<>(nums);
        Collections.sort(newList);
        int sortedNum= newList.get(0);

        List<Integer>newList2= new ArrayList<>(nums);
        Collections.sort(newList2);
        int sortedNumber= newList2.get(newList2.size()-1);

        int numbers = sortedNumber - sortedNum;

        return numbers;
    }
        
}

