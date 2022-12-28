import java.util.Arrays;

/**
 * An array is a group of some predefined number of elements.
 * For instance, we could have an array of 10 ints or 10 Strings.
 *
 * Or, we could have an array of our own custom Objects, such as our own Bird class for a birdwatching
 * application. This would allow us to keep track of many birds and their own behavior.
 *
 * For the following problems, all of the syntax we need is in this documentation:
 * https://www.learnjavaonline.org/en/Arrays
 */
public class ArrayBasics {
    /**
     * @param arr the array we're getting data from.
     * @return the length of arr.
     */
    public int getLengthOfArray(int[] arr){
        return arr.length;
    }



    /**
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to return.
     *          Indexes in arrays start counting from zero.
     * @return the element at index n of arr.
     */
    public int getNthElementOfArray(int[] arr, int n){
        int len= arr.length;
        int[] newArray = new int[len + 1];
        for(int i=0; i<len; i++){
            newArray[i]=arr[i];
        }
        return newArray[n];
        
    }

    /**
     *
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to modify.
     *          Indexes in arrays start counting from zero.
     * @param val the value that we will assign to a spot in the array.
     * @return nothing. Because of pass-by-reference, any change to the array will be reflected across our java program.
     */
    public void setNthElementOfArray(int[] arr, int n, int val){
        for(int i=0; i<arr.length; i++){
            if(i==n){     
                arr[i]=val;
            }
            System.out.println(" "+arr[i]);
        }
    }

    /**
     * @param n the size of the array we wish to create
     * @return a new int array that can contain n elements.
     */
    public int[] returnNewArraySizeN(int n){
        int[] arrSize = new int[n];
        for(int i=0; i<n; i++){
            arrSize[i]=i;
        }
        return arrSize;
    }

    public static void main(String[] args){
        ArrayBasics arrays = new ArrayBasics();

        int[] arr= {1,2,3};
        int indexNum=2;
        int val = 7;        
        
    
        arrays.setNthElementOfArray(arr, indexNum, val);
        
        
    }
}
