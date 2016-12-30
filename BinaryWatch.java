public class Solution {
    
    public int countDigits(int num)
    {
        int count = 0;
        while(num>0)
        {
            count++;
            num = num & (num-1);
        }
        return count;
    }
    
    public List<String> readBinaryWatch(int num) {
        List<String> s = new ArrayList<String>();
        for(int i=0;i<12;i++)
        {
            for(int j=0;j<60;j++)
            {
                if(num == countDigits(i)+countDigits(j))
                {
                    String time = "";
                    if(j<10)
                    {
                        time = i+":0"+j;
                    }
                    else
                    {
                       time = i+":"+j; 
                    }
                    s.add(time);
                }
            }
        }
        return s;
    }
}
