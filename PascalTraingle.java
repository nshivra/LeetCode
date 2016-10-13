public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> temp = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        if(rowIndex == 0){
            temp.add(1);
            return temp;
        }
        else if(rowIndex == 1){
            temp.add(1);
            temp.add(1);
            return temp;
        }
        else{
            temp.add(1);
            temp.add(1);
            for(int i=2;i<=rowIndex;i++){
                List<Integer> temp1 = new ArrayList<Integer>();
                temp1.add(1);
                for(int j=1;j<temp.size();j++){
                    int sum = temp.get(j-1)+temp.get(j);  
                    temp1.add(sum);
                }
                temp1.add(1);
                temp = temp1;
            }
            return temp;
        }
    }
}
