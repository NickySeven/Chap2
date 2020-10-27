public class TotalHours {
    public static void main (String [] args){
        long totalMillisecond = System.currentTimeMillis();
        long totalSeconds = totalMillisecond / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        System.out.println(totalHours);
    }
}
