public class Solution {
    
    public int findPos(int[] heaters,int low,int high, int house) {
        if(low<high)
        {
            int mid = low+(high-low)/2;
            if(house>=heaters[mid] && house<=heaters[mid+1]) return mid;
            else if(house>=heaters[mid] && house>=heaters[mid+1]) return findPos(heaters,mid+1,high,house);
            else if(house<=heaters[mid] && house<=heaters[mid+1]) return findPos(heaters,low,mid,house);
        }
        
        System.out.println(house);
        return -1;
    }
    public int findRadius(int[] houses, int[] heaters) {
        int maxMinSource = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        for(int i=0;i<houses.length;i++)
        {
            int minSource = Integer.MAX_VALUE;
            if(houses[i] >= heaters[heaters.length-1])
            {
                minSource = houses[i] - heaters[heaters.length-1];
            }
            else if(houses[i] <= heaters[0])
            {
                minSource = heaters[0] - houses[i];
            }
            else
            {
                
                int j = findPos(heaters,0,heaters.length-1,houses[i]);
                minSource = Math.min(heaters[j+1] - houses[i],houses[i] - heaters[j]);
            }
            if(minSource > maxMinSource) maxMinSource = minSource;
        }
        return maxMinSource;
    }
}
