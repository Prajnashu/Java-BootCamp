package day2;

public class MaxCharInString {

    public char getMaxOccurringChar(String str)
    {
        //Array with length = 256, one for each possible char in a string.
        int count[] = new int[256];
 
        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        int max = -1; // Initialize max count
        char result = ' '; // Initialize result
 
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
 
        return result;
    }

    public static void main(String[] args) {
        //Total 256 possible characters in a string.
        // for(int i=0; i<255; i++) {
        //     System.out.println((char)i + " " + i);
        // } 
        String str = "sample string";
        MaxCharInString ms = new MaxCharInString();
        System.out.println("Max occurring character is "
                           + ms.getMaxOccurringChar(str));
    }

    
}
