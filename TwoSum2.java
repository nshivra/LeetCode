# Code for finding two numbers such that they add up to a specific target 
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int[] result = {-1,-1};
        while(i<j){
            if((numbers[i] + numbers[j]) == target){
                result[0] = i+1;
                result[1] = j+1;
                break;
            }
            else if((numbers[i] + numbers[j]) > target){
                j--;
            }
            else{
                i++;
            }
        }
        return result;
    }
}
