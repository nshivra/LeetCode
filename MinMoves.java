public int minMoves(int[] nums) {
        // sum - minNum * n = m
        int sum = 0;
        int minNum = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            if(nums[i]<minNum)
            {
                minNum = nums[i];
            }
        }
        
        return sum - (minNum*nums.length);
    }
