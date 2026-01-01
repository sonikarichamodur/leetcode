class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>(n);
        for(int i = 1; i <= n; i++){
            boolean divby3 = i % 3 == 0;
            boolean divby5 = i % 5 == 0;

            String str = "";
            
            if (divby3){
                str += "Fizz";
            }

            if(divby5){
                str += "Buzz";
            }

            if(str.isEmpty()){
                str = String.valueOf(i);
            }
            ans.add(str);
        }
  
        return ans;
    }

    
}