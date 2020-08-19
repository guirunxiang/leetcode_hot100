/**
 * 23.字母异位词分组
 */
class Solution23 {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        List<List<String>> res = new ArrayList<>();
        if(len == 0) return res;

        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            if(!map.containsKey(sortStr(str))) {
                map.put(sortStr(str), new ArrayList<>());
            }

            map.get(sortStr(str)).add(str);
        }

        for(String str : map.keySet()) {
            res.add(map.get(str));
        }
        return res;
    }

    private String sortStr(String str) {
        char[] sc = str.toCharArray();
        Arrays.sort(sc);
        return new String(sc);
    }
}