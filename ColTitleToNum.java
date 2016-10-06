public class Solution {
    public int titleToNumber(String s) {
        
        HashMap<Character,Integer> h = new  HashMap<Character,Integer>();
        
        h.put('A',1);h.put('E',5);h.put('I',9);h.put('M',13);h.put('Q',17);h.put('U',21);h.put('X',24);
        h.put('B',2);h.put('F',6);h.put('J',10);h.put('N',14);h.put('R',18);h.put('V',22);h.put('Y',25);
        h.put('C',3);h.put('G',7);h.put('K',11);h.put('O',15);h.put('S',19);h.put('W',23);h.put('Z',26);
        h.put('D',4);h.put('H',8);h.put('L',12);h.put('P',16);h.put('T',20);
        
        int sum = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            char result = s.charAt(i);
            int num = h.get(result);
            sum = sum + num * (int)Math.pow(26,(n-i-1)); 
        }
        
        return sum;
    }
}
