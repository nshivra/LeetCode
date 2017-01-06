public class Solution {
    
    public LinkedHashMap<Character, Integer> sortHashMapByValues(
            HashMap<Character, Integer> passedMap) {
        List<Character> mapKeys = new ArrayList<>(passedMap.keySet());
        List<Integer> mapValues = new ArrayList<>(passedMap.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);
    
        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
    
        Iterator<Integer> valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Integer val = valueIt.next();
            Iterator<Character> keyIt = mapKeys.iterator();
    
            while (keyIt.hasNext()) {
                Character key = keyIt.next();
                Integer comp1 = passedMap.get(key);
                Integer comp2 = val;
    
                if (comp1.equals(comp2)) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }
        }
        return sortedMap;
    }
    
    public String frequencySort(String s) {
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(h.containsKey(c)) h.put(c,h.get(c)+1);
            else h.put(c,1);
        }
        LinkedHashMap<Character, Integer> l = sortHashMapByValues(h);
        StringBuilder sb = new StringBuilder();
        for(Map.Entry e:l.entrySet())
        {
            int count = 1;
            while(count <= (int)e.getValue())
            {
                sb.append(e.getKey()+"");                
                count++;
            }
        }
        
        return sb.reverse().toString();
    }
}
