class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int p1 = 0;

        for(int p2 = 0; p2 < n; p2++){
            // if the current element is not 0, swap it with the element at p1
            if(nums[p2] != 0){
                int temp = nums[p2]; 
                nums[p2] = nums[p1];
                nums[p1] = temp; 
                p1++; 
            }
            //else, only p2 incrememnts
        }
    }
}