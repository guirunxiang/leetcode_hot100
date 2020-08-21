/**
 * 26.合并区间
 */
class Solution26 {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        List<int[]> res = new ArrayList<>();
        if(len == 0) return res.toArray(new int[0][]);
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int i = 0;
        while(i < len) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            while(i < len-1 && right >= intervals[i+1][0]){
                right =Math.max(right, intervals[i+1][1]);
                i++;
            }
            res.add(new int[]{left, right});
            i++;
        }
        return res.toArray(new int[0][]);
    }
}