package week2.d5.e1;

public class E1ElseIf {
    public static void main(String[] args) {

        // Declare a variable `day` (of type `int`) and assign it a value of 3.
        // If day equals 1, print "Monday: Attend classes."
        // Else if day equals 2, print "Tuesday: Library visit."
        // Else if day equals 3, print "Wednesday: Group study session."
        // Else if day equals 4, print "Thursday: Lab work."
        // Else if day equals 5, print "Friday: Sports day."
        // Else if day equals 6, print "Saturday: Free day for hobbies."
        // Else if day equals 7, print "Sunday: Family time."
        // Print the day and corresponding activity in the format: "Day <day>: <activity>"
int day=3;

if (day==1){
    System.out.println("Monday: Attend classes.");
} else if (day==2) {
    System.out.println("Tuesday: Library visit.");

} else if (day==3) {
    System.out.println("Wednesday: Group study session.");

} else if (day==4) {
    System.out.println("Thursday: Lab work.");

} else if (day==5) {
    System.out.println("Friday: Sports day.");

} else if (day==6) {
    System.out.println("Saturday: Free day for hobbies.");

} else if (day==7) {
    System.out.println("Sunday: Family time.");

}else {
    System.out.println("Invalid day number. Please enter a number between 1 and 7.");

}
        System.out.println("Day "+day+": <activity>");

    }
}
