/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;

        @Override
        public String toString(){
            return "[" + start +"," + end "]";
        }
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval v1, Interval v2){
                return Integer.compare(v1.start, v2.start);
            }
        });
       // System.out.println(intervals);

       if (intervals != null && !intervals.isEmpty()) {
    Interval prev = intervals.get(0);
    System.out.println(prev.start);

        for(int i=1; i<intervals.size(); i++){

            Interval curr = intervals.get(i);
            if(prev.end > curr.start)
                return false;
            else{
                prev = intervals.get(i);
            }

        }
        
        } else {
                System.out.println("Intervals list is null or empty.");
        }
        
        return true;

    }
}
