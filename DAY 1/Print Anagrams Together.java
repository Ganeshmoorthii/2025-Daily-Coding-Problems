class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // Create a map to group anagrams
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        // Iterate over each string in the input array
        for (String s : arr) {
            // Sort the string to get the canonical form
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            // Add the string to the map under its sorted form
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);
        }
        
        // Prepare the result as an ArrayList of ArrayLists
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for (ArrayList<String> group : map.values()) {
            res.add(group);
        }
        
        return res;
    }
}
