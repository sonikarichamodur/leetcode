class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int l = digits.length;

        // find first decreasing element from end
        int i;
        for (i = l - 2; i >= 0; i--) {
            if(digits[i] < digits[i+1]) {
                break;
            }
        }

        // if no such element is found, return -1
        if (i < 0) return -1; 

        // find smallest element > digits[i] on right side
        int j;
        for (j = l - 1; j > i; j--) {
            if(digits[j] > digits[i]) {
                break;
            }
        }

        swap(digits, i, j); 
        reverse(digits, i + 1, l -1);

        // convert to long first, to handle overflow cases
        long result = Long.parseLong(new String(digits));

        return (result <= Integer.MAX_VALUE) ? (int) result : -1;
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }

    private void reverse(char[] arr, int start, int end) {
            while(start < end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
}