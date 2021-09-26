package academy.learnprogramming;

public class challengeSecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(125, 59));
        System.out.println(getDurationString(9787));
        System.out.println(getDurationString(-41));
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = 0;
        if ((minutes >= 0) && (seconds >= 0) && (seconds <= 59)){
            if (minutes >= 60 ){
                hours = minutes / 60;
                minutes = minutes % 60;
            }

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = minutes + "m";
            if (minutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return (hoursString + " " + minutesString + " " + secondsString);
        }
        else {
            return INVALID_VALUE_MESSAGE;
        }

    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
        else{
            return INVALID_VALUE_MESSAGE;
        }
    }


}
