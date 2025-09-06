package week3.d3.e1;

public class E1NestedIfElse {
    public static void main(String[] args) {

        // Create age and height variables, assign values to age and height (age = 14, height = 125)
int age= 14;
int height= 125;


// Check if age is greater than or equal to 12:
if (age>=12) {
//    If true, then check if height is greater than or equal to 120:
    if (height>=120){
        //         If true, print "You are eligible to ride the roller coaster."
        System.out.println("You are eligible to ride the roller coaster.");
    }else {
        //         Else, print "You are old enough, but not tall enough to ride the roller coaster."
        System.out.println("You are old enough, but not tall enough to ride the roller coaster.");
    }
    }else {
    // Else, print "You are not old enough to ride the roller coaster."
    System.out.println("You are not old enough to ride the roller coaster.");

    }


    }
}
