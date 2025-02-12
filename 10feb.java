class Solution {
    public static boolean find(char ch){
        if(!Character.isDigit(ch)){
            return false;
        }
        return true;
    }
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder res = new StringBuilder();
        for(int i =0; i < sb.length(); i++){
            if(!find(sb.charAt(i))){
                res.append(sb.charAt(i));
            }
            else{
                res.deleteCharAt(res.length()-1);
            }
        }
        return res.toString();


 /*private static int findClosestNonDigitToLeft(StringBuilder sb, int digitIndex) {
        for (int i = digitIndex - 1; i >= 0; i--) {
            if (!Character.isDigit(sb.charAt(i))) {
                return i;
            }
        }
        return -1; // if no non-digit character to the left
    }
     private static boolean containsDigit(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    private static int findFirstDigit(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                return i;
            }
        }
        return -1; // should never reach here since input guarantees possible removal of all digits
    }*/


        /*
        public String clearDigits(String s) {

            StringBuilder sb = new StringBuilder(s);
        
        while (containsDigit(sb)) {
            // Find the first digit
            int digitIndex = findFirstDigit(sb);
            
            // Find the closest non-digit character to the left of the digit
            int nonDigitIndex = findClosestNonDigitToLeft(sb, digitIndex);
            
            // Remove both characters
            sb.deleteCharAt(digitIndex); // remove the digit first
            if (nonDigitIndex != -1) {
                sb.deleteCharAt(nonDigitIndex); // remove the closest non-digit to the left
            }
        }
        
        return sb.toString();
        }
        
        */
        
       
    }
}