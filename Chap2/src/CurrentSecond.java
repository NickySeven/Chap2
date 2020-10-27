public class CurrentSecond {
    public static void main (String [] args){
        long totalMillisecond = System.currentTimeMillis();
        long totalSeconds = totalMillisecond / 1000;
        int currentSecond = (int) (totalSeconds % 60);
        System.out.println(currentSecond);
    }
}
