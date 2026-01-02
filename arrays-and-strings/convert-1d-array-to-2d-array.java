class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) { 
        //first check validity
       if(original.length != m * n) return new int[0][0]; 

        // create new 2D array
        int[][] arr = new int[m][n]; 

       for(int i = 0; i < original.length; i++){
            // (0, 0, 0 then 1, 1, 1) returns the next number every n times 
            int row = i / n; 
            // returns itself every n times (0, 1, 2 then 0, 1, 2)
            int col = i % n; 
            // old array is assigned to new array
            arr[row][col] = original[i]; 
       }

       return arr; 
    }
}