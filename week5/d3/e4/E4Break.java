package week5.d3.e4;

public class E4Break {
    public static void main(String[] args) {

        // Declare and initialize an array with items on the production line

        // Enhanced for loop to iterate through the items

        // If the current item is "Defective", print the message and break the loop

        // If the item is not defective, print the message for processing the item

        String [] itens = {"Item1", "Item2", "Defective", "Item3", "Item4"};

        for (String item : itens) {
            if (item.equals("Defective")) {
                System.out.println("Defective item found. Stopping the production line.");
                break;
            }
            System.out.println("Processing " + item);


        }



    }
}
