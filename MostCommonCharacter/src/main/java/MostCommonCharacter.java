
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char maxOccurence = ' ';
        int count = 0;
        int[] countChar = new int[Character.MAX_VALUE +1];
        int len= str.length();

        for(int i=0; i<len; i++){
            char tem = str.charAt(i);

            countChar[tem]++;
            if(countChar[tem]>count){
                count = countChar[tem];
                maxOccurence = tem;
            }

        }
        return maxOccurence;
    }
}
