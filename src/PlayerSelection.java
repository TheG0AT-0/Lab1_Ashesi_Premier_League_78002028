import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TASK 1 - Declaring and Using Variables.
        //Declaring Variables For Player Details.
        System.out.print("Enter Player's Name: ");
        String player_name = input.nextLine();

        System.out.print("Enter Player's Age: ");
        byte player_age = input.nextByte();

        System.out.print("Enter Player's Height (In meters): ");
        float height = input.nextFloat();

        System.out.print("Enter Player's Weight (In pounds): ");
        float weight = input.nextFloat();

        System.out.print("Enter Player's Jersey Number: ");
        byte jersey_number = input.nextByte();
        System.out.println();

        //Displaying Details on the console.
        System.out.print("Here are the Player's details: ");
        System.out.println();
        System.out.print("Player Name - " + player_name);
        System.out.println();
        System.out.print("Age - " + player_age);
        System.out.println();
        System.out.print("Height - " + height + "m");
        System.out.println();
        System.out.print("Weight - " + weight + "Ibs");
        System.out.println();
        System.out.print("Jersey Number - " + jersey_number);
        System.out.println();

        //TASK 2 - Constants, Data Types and Type Casting.
        float pound = 0.45359237f;
        byte meter = 100;
        //Height and Weight converted to Centimeters and Kilograms Respectively.
        float converted_height = height * meter;
        float converted_weight = weight * pound;

        //Casting the Converted Weight in Kilograms to Integer.
        int casted_weight = (int) converted_weight;

        //Displaying Player Details.
        System.out.println();
        System.out.print("Player's details: ");
        System.out.println();
        System.out.print("Player Name - " + player_name);
        System.out.println();
        System.out.print("Age - " + player_age);
        System.out.println();
        System.out.print("Height - " + converted_height + "cm");
        System.out.println();
        System.out.print("Weight - " + casted_weight + "kg");
        System.out.println();
        System.out.print("Jersey Number - " + jersey_number);
        System.out.println();

        //Task 3 - Increment and Decrement Operators.
        System.out.println();
        System.out.println("Player's Age Currently " + player_age);
        System.out.println("Player's Age Increased by 1: ");
        player_age++; //Player's age increased by 1
        jersey_number--; //Player jersey number decreased by 1

        System.out.println("Player's Age Now - " + player_age);
        System.out.println("Player jersey number after penalty: " +  jersey_number);

        //Task 4 - Boolean Expressions and Logical Operators
        System.out.println();
        boolean eligibility = (player_age >=18 && player_age <= 35 && casted_weight < 90);
        //Checking Eligibility with &&.
        if (eligibility) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not eligible");
        }
        //Experiment with OR.
        if (player_age < 18 || casted_weight >= 90) {
            System.out.println("Player has a problem (either too young or too heavy)");
        }
        //Experiment with NOT.
        if (!eligibility) {
            System.out.println("Not eligible");
        }

        //Task 5 - Selection Statement. (if - else.)
        String player_category;
        if (player_age < 20) {
            player_category = "Rising Star";
        }
        else if (player_age >= 20 && player_age <= 30) {
            player_category = "Prime Player";
        }
        else {
            player_category = "Veteran";
        }
        System.out.println("The Player's Category is: " +  player_category);
        System.out.println();

        //Task 6 - Switch Cases (Basic)
        System.out.println();
        System.out.print("Enter Player's jersey number: ");
        byte player_jersey_number = input.nextByte();
        String player_position;
        switch (player_jersey_number) {
            case 1: player_position = "Goalkeeper"; break;
            case 2: player_position = "Defender"; break;
            case 5: player_position = "Defender"; break;
            case 6: player_position = "Midfielder"; break;
            case 8: player_position = "Midfielder"; break;
            case 7: player_position = "Winger"; break;
            case 11: player_position = "Winger"; break;
            case 9: player_position = "Striker"; break;
            case 10: player_position = "Playmaker"; break;
            default: player_position = "No position"; break;
        }
        System.out.println("The Player's Position is: " + player_position );

        //Task 7 - Switch Cases (Running Case / Fall-Through)
        //Part A (Unwanted Fall-Through):
        switch (player_jersey_number) {
            case 1: player_position = "Goalkeeper"; break;
            case 2: player_position = "Defender";
            case 5: player_position = "Defender"; break;
            case 6: player_position = "Midfielder";
            case 8: player_position = "Midfielder"; break;
            case 7: player_position = "Winger";
            case 11: player_position = "Winger"; break;
            case 9: player_position = "Striker"; break;
            case 10: player_position = "Playmaker"; break;
            default: player_position = "No position"; break;
        }
        System.out.println("The Player's Position is: " + player_position );
        //Part B (Grouped Case – Useful Fall-Through):
        switch (player_jersey_number) {
            case 1: player_position = "Goalkeeper"; break;
            case 2: case 5: player_position = "Defender"; break;
            case 6: case 8: player_position = "Midfielder"; break;
            case 7: case 11: player_position = "Winger"; break;
            case 9: player_position = "Striker"; break;
            case 10: player_position = "Playmaker"; break;
            default: player_position = "No position"; break;
        }
        System.out.println("The Player's Position is: " + player_position );

        //Task 8 – Nested Ifs
        String lineup;
        if (player_category.equals("Prime Player")) {
            if (casted_weight < 80) {
                lineup = "Starting lineup";
            }
            else {
                lineup = "Bench";
            }
        }
        else{
            lineup = "Bench";
        }

        //Task 9 – Conditional Expression (Ternary Operator)
        String final_status = eligibility ? "Play" : "Rest";
        System.out.println("Player final status is: " + final_status);
        System.out.println();

        System.out.println("FINAL REPORT.");
        System.out.println();
        System.out.println("Player: " + player_name);
        System.out.println("Age: " + player_age + " (" + player_category + ")");
        System.out.println("Height - " + converted_height + "cm");
        System.out.println("Weight - " + casted_weight + "kg");
        System.out.println("Jersey Number - " + jersey_number);
        System.out.println("Position - " + player_position );
        System.out.println("Eligibility - " + (eligibility ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision - " + lineup);
        System.out.println("Final decision - " +  final_status);








    }

}
