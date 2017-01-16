public class RandomizedSet {
    /** Initialize your data structure here. */
    HashMap<Integer,Integer> h;
    HashMap<Integer,Integer> reverseMap;
    ArrayList<Integer> a;
    int currIndex = 0;
    
    public RandomizedSet() {
        a = new ArrayList<Integer>();
        h = new HashMap<Integer,Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(h.containsKey(val)) return false;
        h.put(val,currIndex);
        a.add(val);
        currIndex++;
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(null == h.get(val)) return false;
        int i = h.get(val);
        
        int temp = a.get(currIndex-1);
        a.set(currIndex-1,a.get(i));
        a.set(i,temp);
        h.put(temp,i);
        
        h.remove(val);
        a.remove(currIndex-1);
        currIndex--;
        
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        int  n = rand.nextInt(h.size());
        return a.get(n);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
