public class Solution {
    public String convertToTitle(int n) {
        HashMap<Integer,Character> h = new HashMap<Integer,Character>();   
        h.put(0,'A');h.put(4,'E');h.put(8,'I');h.put(12,'M');h.put(16,'Q');h.put(20,'U');h.put(23,'X');
        h.put(1,'B');h.put(5,'F');h.put(9,'J');h.put(13,'N');h.put(17,'R');h.put(21,'V');h.put(24,'Y');
        h.put(2,'C');h.put(6,'G');h.put(10,'K');h.put(14,'O');h.put(18,'S');h.put(22,'W');h.put(25,'Z');
        h.put(3,'D');h.put(7,'H');h.put(11,'L');h.put(15,'P');h.put(19,'T');
        
        StringBuilder sb = new StringBuilder();
        
        while(n >= 1){
            sb.append(h.get((n-1)%26));
            n = (n-1)/26;
        }
        
        return sb.reverse().toString();
        
    }
}
