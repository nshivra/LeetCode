class ValueComparator implements Comparator<Integer>{
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	public ValueComparator(HashMap<Integer, Integer> map){
		this.map.putAll(map);
	}
	public int compare(Integer s1, Integer s2) {
		if(map.get(s1) >= map.get(s2)) return -1;
		else return 1;
	}
}

public class Solution {
    public static TreeMap<Integer, Integer> sortMapByValue(HashMap<Integer, Integer> map){
		Comparator<Integer> comparator = new ValueComparator(map);
		TreeMap<Integer, Integer> result = new TreeMap<Integer, Integer>(comparator);
		result.putAll(map);
		return result;
	}
    public List<Integer> topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(result.containsKey(nums[i])) result.put(nums[i],result.get(nums[i])+1);
            else result.put(nums[i],1);
        }
        List<Integer> l = new ArrayList<Integer>();
        TreeMap<Integer, Integer> sortedMap = sortMapByValue(result);  
        for(Map.Entry e:sortedMap.entrySet())
        {
            if(l.size()<k) l.add((Integer)e.getKey());
        }
        return l;
    }
}
