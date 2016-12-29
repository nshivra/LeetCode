    public int findContentChildren(int[] g, int[] s) {
        int l1 = g.length;
        int l2 = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int count = 0;
        while(i<l1 && j<l2)
        {
            if(g[i]>s[j])
            {
             j++;
            }
            else
            {
                count++;
                i++;
                j++;
            }
        }
        return count;
    }
