public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length()==0 || "".equals(str)) return 0;
        str = str.trim();
        
        boolean isFalse = false;
        StringBuilder sb= new StringBuilder();
        
        HashMap<Character,Boolean> h= new HashMap<Character,Boolean>();
        h.put('0',true);h.put('2',true);h.put('4',true);h.put('6',true);h.put('8',true);
        h.put('1',true);h.put('3',true);h.put('5',true);h.put('7',true);h.put('9',true);
        
        boolean isContReq=true;
        
        if(str.charAt(0) == '-') isFalse = true;
        else if(str.charAt(0) == '+') isFalse = false;
        else if(h.containsKey(str.charAt(0))) sb.append(str.charAt(0)); 
        else isContReq = false;
        
        if(isContReq){
            for(int i=1;i<=str.length()-1;i++){
                if(h.containsKey(str.charAt(i))){
                        sb.append(str.charAt(i));        
                }
                else{
                        break;
                }
            }
        }
        
        if("".equals(sb.toString())) return 0;
        try{
            if(isFalse){
                return -1*Integer.parseInt(sb.toString());
            }
            else{
                return Integer.parseInt(sb.toString());
            }
        }
        catch(Exception e){
            if(isFalse){
                return Integer.MIN_VALUE;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }
    }
}
