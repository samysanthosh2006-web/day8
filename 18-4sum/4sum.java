class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
            //condition for i and j to avoid duplicate
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int lp = j+1, rp = nums.length-1;
                while(lp<rp){
                    long sum = (long)nums[i]+nums[j]+nums[lp]+nums[rp];
                    if(sum<target){
                        lp++;
                    }else if(sum>target){
                        rp--;
                    }else{
                        result.add(Arrays.asList(nums[i],nums[j],nums[lp],nums[rp]));
                         
                         //condition for lp and rp pointer to avoid duplicate
                         while(lp<rp && nums[lp]==nums[lp+1]){
                            lp++;
                         }
                         while(lp<rp && nums[rp]==nums[rp-1]){
                            rp--;
                         }
                         lp++;
                         rp--;

                    }
                }
            }
        }
        return result;
    }
}