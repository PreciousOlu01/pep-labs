
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int a= arr1.length;
        int b= arr2.length;
        int c= a + b;
        int[] arr3 = new int[c];

        for(int i=0; i<a; i++){
            arr3[i]= arr1[i];
        }
        for(int j=0; j<b; j++){
            arr3[a + j]= arr2[j];
        }
        return arr3;
    }
}
