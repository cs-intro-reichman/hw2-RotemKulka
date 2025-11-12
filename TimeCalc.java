public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); //hh
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); //mm
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (hours*60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours*60);
        String newHours1 = ""+newHours;
        String newMinutes1 = ""+newMinutes;
        if (newHours1.length() == 1){
            System.out.print("0"+newHours1+":");
        } else {
            System.out.print(newHours1+":");
        }
        if (newMinutes1.length() == 1){
            System.out.print("0"+newMinutes1);
        } else {
            System.out.print(newMinutes1);
        }
    }
}

