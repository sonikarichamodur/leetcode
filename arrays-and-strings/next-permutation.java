class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int k = -1;
        for (int i = 0; i < n-1; i++) {
            if(nums[i] < nums[i+1]){
                k = i;
            }
        }
        if (k == -1) {
            reverse(nums, 0, n-1);
            return; 
        }

        int l = -1;
        for (int i = k + 1; i < n; i++) {
            if(nums[i] > nums[k]){
                l = i; 
            }
        }
        swap(nums, k, l);
        reverse(nums, k+1, n-1); 
        }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--; 
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
}
