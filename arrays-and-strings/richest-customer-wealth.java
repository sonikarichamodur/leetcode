class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int maxWealth = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            if(i == 0 || wealth > maxWealth){
                maxWealth = wealth; 
            }
            // need to reset to 0 because a new wealth value must be calculated for each row 
            wealth = 0; 
        }
        return maxWealth;
    }
}