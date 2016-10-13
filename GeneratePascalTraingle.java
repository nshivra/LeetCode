public class Solution {
    public List<List<Integer>> generate(int rowIndex) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(rowIndex == 0) return result;
        List<Integer> temp = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        if(rowIndex == 1){
            result.add(Arrays.asList(1));
            return result;
        }
        else if(rowIndex == 2){
            result.add(Arrays.asList(1));
            result.add(Arrays.asList(1,1));
            return result;
        }
        else{
            result.add(Arrays.asList(1));
            result.add(Arrays.asList(1,1));
            temp.add(1);
            temp.add(1);
            for(int i=3;i<=rowIndex;i++){
                List<Integer> temp1 = new ArrayList<Integer>();
                temp1.add(1);
                for(int j=1;j<temp.size();j++){
                    int sum = temp.get(j-1)+temp.get(j);  
                    temp1.add(sum);
                }
                temp1.add(1);
                result.add(temp1);
                temp = temp1;
            }
            return result;
        }
    }
}
