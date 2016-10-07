public class Solution {
    public int[] plusOne(int[] digits) {
        boolean all9 = true;
        for(int i=0;i<digits.length;i++){
            if(digits[i] != 9)
            {
                all9 = false;
                break;
            }
        }
        
        if(all9){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            return result;
        }
        else{
            int carry = 1;
            for(int i=digits.length-1;i>=0;i--){
                if(carry + digits[i] > 9)
                {
                    carry = 1;
                    digits[i] = 10-(carry + digits[i]);
                }
                else{
                     digits[i] = carry + digits[i];
                     break;
                }
            }
            return digits;
        }
    }
}
