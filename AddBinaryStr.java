public class Solution {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()){
            while(a.length() != b.length())
            {
                a = "0"+a;
            }
        }
        else{
            while(a.length() != b.length())
            {
                b = "0"+b;
            }
        }
        char[] aAr = a.toCharArray();
        char[] bAr = b.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        char carry = '0';
        for(int i=aAr.length-1;i>=0;i--){
            if(aAr[i] == '0' && bAr[i] == '0')
            {
                if(carry == '0') 
                {
                    sb.append('0');
                }
                else
                {
                    sb.append('1');
                    carry = '0';
                }
            }
            else if(aAr[i] == '1' && bAr[i] == '1')
            {
                if(carry == '0') 
                {
                    sb.append('0');
                }
                else
                {
                    sb.append('1');
                }
                carry = '1';
            }
            else 
            {
                if(carry == '0') 
                {
                    sb.append('1');
                    carry = '0';
                }
                else
                {
                    sb.append('0');
                    carry = '1';
                }
            }
        }
        if(carry == '1') sb.append('1');
        return sb.reverse().toString();
    }
}
