public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A == null || A.length == 1 || A.length == 2) return 0; 
        List<List<Integer>> l1 = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        boolean f = true;
        for(int i=2;i<A.length;i++)
        {
            if(((A[i-2]-A[i-1]) == (A[i-1]-A[i])) && i!=A.length-1)
            {
                if(f)
                {
                    l.add(A[i-2]);
                    l.add(A[i-1]);
                    l.add(A[i]);
                    f = false;
                }
                else
                {
                    l.add(A[i]);
                }
            }
            else if(((A[i-2]-A[i-1]) == (A[i-1]-A[i])) && i==A.length-1)
            { 
                if(f)
                {
                    l.add(A[i-2]);
                    l.add(A[i-1]);
                    l.add(A[i]);
                    f = false;
                }
                else
                {
                    l.add(A[i]);
                }
                
                if(l.size()>=3)
                {
                    l1.add(l);
                    f = true;
                }
                l = new ArrayList<Integer>();
            }
            else
            {
                if(l.size()>=3)
                {
                    l1.add(l);
                    f = true;
                }
                l = new ArrayList<Integer>();
            }
        }
        int sum = 0;
        for(List<Integer> lT:l1)
        {
            int i = lT.size();
            int count = 1;
            for(int j=4;j<=i;j++)
            {
                count=count+(j-2);
            }
            sum +=count;
        }
        return sum;
    }
}
