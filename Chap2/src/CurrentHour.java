public class CurrentHour {
    public static void main (String [] args) {
        long totalMillisecond = System.currentTimeMillis();
        long totalSeconds = totalMillisecond / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println(currentHour);
    }
}
