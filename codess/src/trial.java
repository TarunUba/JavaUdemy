public class trial {
    public static long toMilesPerHour (double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        long miles = Math.round(kilometersPerHour/1.66)
    }
}
