public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        if(num1 == null || num1.length()==0) return num2;
        else if(num2 == null || num2.length()==0) return num1;
        int l1 = num1.length();
        int l2 = num2.length();
        
        int a = l1-1;
        int b = l2-1;
        int carry = 0;
        while(a>=0 && b>=0){
            int x = carry + Integer.parseInt(String.valueOf(num1.charAt(a))) + Integer.parseInt(String.valueOf(num2.charAt(b)));
            if(x >= 10){
                sb.append(x - 10);
                carry = 1;
            }
            else{
                sb.append(x);
                carry = 0;
            }
            a--;
            b--;
        }
        
        while(a>=0){
            int x = carry + Integer.parseInt(String.valueOf(num1.charAt(a)));
            if(x >= 10){
                sb.append(x - 10);
                carry = 1;
            }
            else{
                sb.append(x);
                carry = 0;
            }
            a--;
        }
        
        while(b>=0){
            int x = carry + Integer.parseInt(String.valueOf(num2.charAt(b)));
            if(x >= 10){
                sb.append(x - 10);
                carry = 1;
            }
            else{
                sb.append(x);
                carry = 0;
            }
            b--;
        }
        
        if(carry == 1) sb.append(1);
        
        return sb.reverse().toString();
    }
}
