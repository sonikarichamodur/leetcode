class Solution {
    public int findNumbers(int[] nums) {
        // variable should be outside for loop if it's being returned at the end
        int evenDigits = 0;
        for(int i = 0; i < nums.length;i++){
            int n = nums[i];
            // count the number of digits in the number
            int digits = 0;
            while(n != 0){
                digits++;   
                n = n / 10;
            }
            if(digits % 2 == 0) evenDigits++;
        }
        return evenDigits;
    }
}
    
    