package conditionals.switchExercise;

public class SwitchExerciseRunner {
    public static void main(String[] args) {
        System.out.println(determineNameOfDay(6));
        System.out.println(determineNameOfMonth(12));
        System.out.println(isWeekDay(5));
    }
    public static String determineNameOfDay(int dayNumber) {
        String result = "";
        switch (dayNumber) {
            case 0:
//                return "Sunday";
                result = "Sunday";
                break;
            case 1:
//                return "Monday";
                result = "Monday";
                break;
            case 2:
//                return "Tuesday";
                result = "Tuesday";
                break;
            case 3:
//                return "Wednesday";
                result = "Wednesday";
                break;
            case 4:
//                return "Thursday";
                result = "Thursday";
                break;
            case 5:
//                return "Friday";
                result = "Friday";
                break;
            case 6:
//                return "Saturday";
                result = "Saturday";
                break;

        }
        return result;
    }
    public static String determineNameOfMonth(int monthNumber) {
        String result = "";
        switch (monthNumber) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
        }
        return result;
    }
    public static boolean isWeekDay(int dayNumber) {
        switch (dayNumber) {
//            case 0:
//            case 6: return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: return true;

        }
        return false;
    }
}
