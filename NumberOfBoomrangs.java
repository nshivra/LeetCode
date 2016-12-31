public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0; 
        for(int i=0;i<points.length;i++)
        {
            HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
            int same = 0;
            for(int j=0;j<points.length;j++)
            {
                if(i == j) continue;
                int d = (int)calcDist(points[i],points[j]);
                if(h.containsKey(d))
                {
                    int val = h.get(d);
                    h.put(d,val+1);
                }
                else
                {
                    h.put(d,1);
                }
            }
            
            for(int val : h.values()) {
                count += val * (val-1);
            }  
            h.clear();
        }
        return count;
    }
    
    public double calcDist(int[] p,int[] q)
    {
        return ((p[0]-q[0])*(p[0]-q[0])) +((p[1]-q[1])*(p[1]-q[1]));  
    }
}
