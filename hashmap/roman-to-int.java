class Solution {
    public int romanToInt(String s) {
      Map<Character, Integer> m = new HashMap<>();
      int n = s.length();
      m.put('I', 1);
      m.put('V', 5);
      m.put('X', 10);
      m.put('L', 50);
      m.put('C', 100);
      m.put('D', 500);
      m.put('M', 1000);

     // put the last numeral in, since you wont subtract it no matter what 
      int sum = m.get(s.charAt(n-1)); 
      // then iterate from last but one 
      for(int i = n - 2; i >= 0 ; i--){ 
        // if the numeral before is smaller
        if(m.get(s.charAt(i)) < m.get(s.charAt(i+1))) { 
            // subtract it from answer
            sum -= m.get(s.charAt(i)); 
        }
        else {
            // add it to answer otherwise 
            sum += m.get(s.charAt(i)); 
        }
      }
      return sum;  
    }
}