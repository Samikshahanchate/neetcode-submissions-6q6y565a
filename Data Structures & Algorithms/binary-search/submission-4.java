class Solution {
    public int search(int[] nums, int target) {
        int r = nums.length - 1;
        return  helper(nums, 0 , r, target);
    }

    int helper(int[] nums, int l, int r, int target){

        if(l<=r){
            int mid = l+(r-l)/2;

            if(nums[mid] == target)
                return mid;
            else if(target<nums[mid])
                return helper(nums,l, mid-1,target);
            else
               return helper(nums, mid+1,r,target);
        }
        return -1;
    }
}



