class Solution {
    
    //custom class
    public class Room {
        int endTime;
        //occupied room
        int num;

        public Room(int endTime, int num) {
            this.endTime = endTime;
            this.num = num;
        }
    }

    public int mostBooked(int n, int[][] meetings) {
         // sort by meeting start times
        Arrays.sort(meetings, (a,b) -> (a[0] - b[0]));

        //Queue to keep track of room numbers which are available
        PriorityQueue<Integer> availableRoom = new PriorityQueue();

        //Queue to store Room object for each meeting, sorted by endTimes
        //if meeting's endTime is same, sort by smaller room number
        PriorityQueue<Room> runningMeeting = new PriorityQueue<Room>(
            (a, b) -> a.endTime == b.endTime ? a.num - b.num : a.endTime - b.endTime
        );

        //array to track most used rooms
        int[] count = new int[n];


        //final result : room number - we will keep it updating
        int res = 0;

        //To begin with, all rooms will be available
        for (int i=0; i < n; i++) {
            availableRoom.offer(i);
        }

        //processing: Iterate over each meeting interval
        for (int[] next: meetings) {
            /**check if any room is available before scheduling next meeting. 
That is, if next meeting starts after (or during: equal-to sign) current 
running meeting's endtime. Keep updating available room for next meeting**/
            while (!runningMeeting.isEmpty() && runningMeeting.peek().endTime <= next[0]) {
                availableRoom.offer(runningMeeting.poll().num);
            }

            /**There will be two cases:
            a) Ideal- at least one room available for next meeting- no delay. So, start time will be next[0]
            b) Delay- no room is available. So you pick the top (first ending meeting) and add the delay. Initialize 'latestPossibleStartTime' with next[0]. We will see if there is a delay**/
            int latestPossibleStartTime = next[0];

            /** Now look if there is delay due to non-availability of rooms**/
            if (availableRoom.isEmpty()) {
                /**then, pick the first ending meeting (or one of the such meetings with smaller room number)**/
                Room firstEndingMeeting = runningMeeting.poll();
                latestPossibleStartTime = firstEndingMeeting.endTime;

                //room number released by firstEndingMeeting
                availableRoom.offer(firstEndingMeeting.num);
            }

            /** Now we have a room available - schedule the next meeting
            a) update number of meetings held by this room so far
            b) for a delayed meeting, update the new end time before placing it into runningMeeting queue**/
            int room = availableRoom.poll();
            count[room]++;
            int meetingInterval = next[1]-next[0];
            runningMeeting.offer(new Room(meetingInterval+latestPossibleStartTime, room));

            //update 'res' with max meetings holding room number
            if (count[room] > count[res]) {
                res = room;
                //if same- go for smaller number
            } else if (count[room] == count[res]) {
                res = Math.min(res, room);
            }
        }
        return res;
    }
}