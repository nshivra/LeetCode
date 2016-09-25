# Given a non-negative integer num, repeatedly add all its digits until the result has only one digit. 
public class Solution {
    public int addDigits(int num) {
        int res = 0;
        while(num>0){
            int dig = num%10;
            res = res + dig;
            num = num/10;
        }
        
        if(res >= 10){
            return addDigits(res);
        }
        
        return res;
    }
}

public class Solution {
    public int addDigits(int num) {
        if(num == 0)
            return 0;
        else if(num%9 == 0)
            return 9;
        else
            return num%9;
    }
}
