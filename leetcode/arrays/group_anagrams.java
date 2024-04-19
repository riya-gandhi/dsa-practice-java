class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ansList = new ArrayList<>();
        String[] sortedStrsArr = new String[strs.length];

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] charTempArr = strs[i].toCharArray();
            Arrays.sort(charTempArr);
            String sortedTempStr = new String(charTempArr);
            sortedStrsArr[i] = sortedTempStr;
        }

        for(int i=0; i<sortedStrsArr.length; i++){

            ArrayList<Integer> tempList = map.get(sortedStrsArr[i]);

            if (tempList == null) {
                // Create a new ArrayList and add the index to it
                tempList = new ArrayList<>();
                tempList.add(i);
                // Put the sorted string and its associated ArrayList into the map
            } else {
                // If tempList already exists, just add the index to it
                tempList.add(i);
            }
            map.put(sortedStrsArr[i], tempList);
        }

        for(String key : map.keySet()){

            ArrayList<String> anagramList = new ArrayList<>();
            ArrayList<Integer> indexesArr = map.get(key);

            for(int i : indexesArr){
                anagramList.add(strs[i]);
            }

            ansList.add(anagramList);
        }

        return ansList;
        
    }
}