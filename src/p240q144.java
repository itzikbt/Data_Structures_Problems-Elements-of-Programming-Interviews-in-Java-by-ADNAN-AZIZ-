import java.util.*;

public class p240q144 {
    public static void main(String[] args) {

    }

    public static int findMaxSimultaneousEvents(List<Event> events){
        List<EndPoint> endPoints = new ArrayList<>();
        for (Event e: events){
            endPoints.add(new EndPoint(e.start, true));
            endPoints.add(new EndPoint(e.finish, false));
        }
        Collections.sort(endPoints);

        int simultaneous = 0, maxSimultaneous = 0;

        for (EndPoint ep: endPoints){
            if (ep.isStart){
                simultaneous++;
                maxSimultaneous = Math.max(simultaneous, maxSimultaneous);
            }
            else {
                simultaneous--;
            }
        }
        return maxSimultaneous;

    }


    public static class Event{
        int start;
        int finish;

        public Event(int start, int finish){
            this.start = start;
            this.finish = finish;
        }

    }

    public static class EndPoint implements Comparable<EndPoint>{
        boolean isStart;
        int time;

        public EndPoint(int time, boolean isStart){
            this.time = time;
            this.isStart = isStart;
        }

        public int compareTo(EndPoint other){
            if (this.time != other.time)
                return Integer.compare(this.time, other.time);
            return this.isStart && !other.isStart ? -1 : !this.isStart && other.isStart ? 1 : 0;
        }

    }


}
