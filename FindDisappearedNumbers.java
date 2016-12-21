    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i:nums)
        {
            nums[Math.abs(i)-1] = -Math.abs(nums[Math.abs(i)-1]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0) l.add(i+1);
        }
        return l;
    }
