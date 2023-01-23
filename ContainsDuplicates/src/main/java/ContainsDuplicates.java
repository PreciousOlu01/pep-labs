import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        Integer[] arrays= new Integer[nums.length];
        for(int i=0; i<nums.length; i++){
            arrays[i] = Integer.valueOf(nums[i]);
        }
        Set<Integer>newSet= new HashSet<Integer>(Arrays.asList(arrays));
        if(newSet.size()==arrays.length){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        ContainsDuplicates obj = new ContainsDuplicates();
        int[] arr={2,4,6,1};

        System.out.println(obj.containsDuplicate(arr));
    }
}
