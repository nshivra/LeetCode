public class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == '0') sb.append('1');
            else sb.append('0');
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
