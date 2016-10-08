public class Solution {
    public int compareVersion(String version1, String version2) {
        int l1 = version1.split("\\.").length;
        int l2 = version2.split("\\.").length;
        int i = 0;
        int j = 0;
        
        if(l1<=l2){
            for(int k=0;k<l2-l1;k++){
                version1 = version1+".0";
            }
        }
        else{
            for(int k=0;k<l1-l2;k++){
                version2 = version2+".0";
            }
        }
        while(i<l1 || j<l2){
            if(Integer.parseInt(version1.split("\\.")[i]) > Integer.parseInt(version2.split("\\.")[j])){
                return 1;
            }
            else if(Integer.parseInt(version1.split("\\.")[i]) < Integer.parseInt(version2.split("\\.")[j])){
                return -1;
            }
            else{
                i++;
                j++;
            }
        }
        return 0;
    }
}
