public class Solution {
    public int reverse(int x) {
        StringBuffer sb = new StringBuffer();
        boolean isPos = false;
        
        if(x == 0) return x;
        
        if(x>0){
            isPos = true;
        }
        else{
            x = x * -1;
        }
        
        while(x>0){
            sb.append(x%10);
            x = (x - x%10)/10;
        }
        try{
            if(!isPos){
                 return -1*Integer.parseInt(sb.toString());
            }
            else{
                return Integer.parseInt(sb.toString());
            }
        }
        catch(Exception e){
            return 0;
        }
        
       
    }
}
