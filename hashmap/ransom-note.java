class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // must count occurrences of each character in magazine
        //and see if there are enough occurences to form the ransom note

        // create HashMap to store char counts
        HashMap<Character, Integer> dictionary = new HashMap<>();

        // iterate thru chars in magazine
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);

            // if char not in HashMap, put it with its count as 1
            if(!dictionary.containsKey(c)){
                dictionary.put(c, 1);
            }
            // if char in HashMap, increment its count by 1 (get its value and add to it)
            else {
                dictionary.put(c, dictionary.get(c) + 1); 
            }
        }

        // iterate through chars in ransom note
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);

            / /if char in HashMap and count > 0, decrement count by 1
            if(dictionary.containsKey(c) && dictionary.get(c) > 0){
                dictionary.put(c, dictionary.get(c) -1);
            }
            else{
                // if char not in HashMap (wasn't put in at all, or count = 0)
                // then there are not enough letters in magazine to make ransom note
                return false; 
            } // end else
        } // end for
        return true; 
    }
}