import java.util.Arrays;

public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int max= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
       
        return max;
    }

    public static void main(String[] args){
        GetMax maxVal= new GetMax();
        int[] arr={2,5,6,20,9,10};
        int result= maxVal.max(arr);

        System.out.println(result);
    }
}
