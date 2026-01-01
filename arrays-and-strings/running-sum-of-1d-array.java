class Solution {
    public int[] runningSum(int[] nums) {
        // create an array to store running sum
        int[] runningSum = new int[nums.length]; 
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            // add each element to a sum variable
            sum = sum + nums[i];  
            // now put each intermediate sum as an element of the array 
            runningSum[i] = sum; 
        }
        return runningSum;
    }
}