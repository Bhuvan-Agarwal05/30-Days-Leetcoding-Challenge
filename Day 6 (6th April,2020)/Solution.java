class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        Map<String, List<String>> map = new LinkedHashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(map.containsKey(sorted)){
                map.get(sorted).add(strs[i]);
            }else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sorted, list);
            }
        }
        return new ArrayList<>(map.values());
        
    }
}