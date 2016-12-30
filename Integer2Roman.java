public class Solution {
    
    public int findSuitable(int[] a,int num,int low,int high)
    {
        if(low<high)
        {
            int mid = low+(high-low)/2;
            if(a[mid] <=num && a[mid+1] > num) return mid;
            else if(a[mid+1] == num) return mid+1;
            else if(a[mid] < num && a[mid+1] < num) return findSuitable(a,num,mid+1,high);
            else if(a[mid] > num && a[mid+1] > num) return findSuitable(a,num,low,mid);
        }
        return -1;
    }
    
    public String intToRoman(int num) {
        if(num == 0) return "";
        
        HashMap<Integer,String> h = new HashMap<Integer,String>();
        h.put(1,"I");h.put(4,"IV");h.put(5,"V");h.put(9,"IX");h.put(10,"X");h.put(40,"XL");h.put(50,"L");
        h.put(90,"XC");h.put(100,"C");h.put(400,"CD");h.put(500,"D");h.put(900,"CM");h.put(1000,"M");

        int[] a = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        StringBuilder sb = new StringBuilder();
        
        while(num>0)
        {
            int i=0;
            if(num <= a[0]) i = 0;
            else if(num>=a[a.length-1]) i= a.length-1;
            else i = findSuitable(a,num,0,a.length-1);
            sb.append(h.get(a[i]));
            num = num - a[i];
        }
        return sb.toString();
    }
}
