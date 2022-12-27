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
    int count=0;
    public int getLengthOfArray(int[] arr){
        int arrLength=arr.length;
        for(int i=0; i<arrLength; i++){
            count++;
        }
        return count;
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
        int len= arr.length;
        int[] newArray= new int[len+1];
        int j=0;
        for(int i=0; i<newArray.length-1; i++){
            if(n==arr[i]){
                newArray[j]=val;
            }
            else{
                newArray[j]=arr[i];
                j++;
            }    
        }
        newArray[n]=val;
        System.out.println(Arrays.toString(newArray));
    }

    /**
     * @param n the size of the array we wish to create
     * @return a new int array that can contain n elements.
     */
    public int[] returnNewArraySizeN(int n){
        int[] arrSize = new int[n];
        return arrSize;
    }

    public static void main(String[] args){
        ArrayBasics arrays = new ArrayBasics();

        int[] arr= {2,4,6};
        int indexNum=2;
        int val = 8;

        int result = arrays.getLengthOfArray(arr);
        int results = arrays.getNthElementOfArray(arr, indexNum);
        arrays.setNthElementOfArray(arr, indexNum, val);

        System.out.println(result);
        System.out.println(results);
        
    }
}
