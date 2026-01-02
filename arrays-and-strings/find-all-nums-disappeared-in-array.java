class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        List<Integer> disNums = new ArrayList<>();
        HashSet<Integer> expNums = new HashSet<>();

        for(int i = 0; i < n; i++){
            expNums.add(nums[i]);
        }

        for(int i = 1; i <= n; i++){
            if(!expNums.contains(i)){
                disNums.add(i);
            }
        }
        return disNums; 
    }

}