/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        intervals.sort((a,b)->a.start-b.start);
       // System.out.println(intervals.toArray());

        Queue<Integer> que = new PriorityQueue<>();

        for( Interval intervl: intervals){
            if(!que.isEmpty() && que.peek()<=intervl.start)
                que.poll();
        
        que.offer(intervl.end);
        }

        return que.size();
        
    }
}
