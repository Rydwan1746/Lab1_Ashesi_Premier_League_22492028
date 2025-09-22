import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args){
        //declaring variables for player details
        String name;
        int age;
        double height;
        double weight;
        int jersey_number;
        // input player details
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        System.out.print("Enter player's height (in meters): ");
        height = sc.nextDouble();
        System.out.print("Enter player's weight(in pound): ");
        weight = sc.nextDouble();
        System.out.print("Enter player's jersey number: ");
        jersey_number = sc.nextInt();

        System.out.println("Player name: "+ name);
        System.out.println("player age: "+age);
        System.out.println("Player height: "+height+"m");
        System.out.println("Player weight: "+weight+"lbs");
        System.out.println("Player jersey number: "+jersey_number);

        //creating constant variables
        final double POUND = 0.45359237;
        final int METER = 100;
        //converting the weight and the height
        weight *= POUND;
        height *=METER;

        // Casting: changing the weight data type
        int castedWeight = (int) weight;

        // display
        System.out.println(" ");
        System.out.println("Player name: "+ name);
        System.out.println("player age: "+age);
        System.out.println("Player height: "+height+"cm");
        System.out.println("Player weight: "+castedWeight+"Kg");
        System.out.println("Player jersey number: "+jersey_number);

        // incrementing and decrementing
        System.out.println(" ");
       System.out.println("Current age: " + age++);
       System.out.println("Age during the next season: " + age);

       // Simulate a penalty where the jersey number decreases by 1.
        System.out.println("The player with the jersey number "+ jersey_number-- +" got penalised");
        System.out.println("New Jersey number: "+ jersey_number);

        //Check eligibility
        System.out.println(" ");
        String eligibility;
        if (age >= 18 && age <=35 && castedWeight < 90)
        {
            eligibility = "Eligible";
        } else {
            eligibility = "Not Eligible";
        } System.out.println(eligibility);
        // Underage or overweight
        if ( age <18 || castedWeight >=90 ){
            System.out.println("Player has a problem (either too young or too heavy)");
        } else {
            System.out.println("The player is not underage and is not too heavy");
        }
        // experiment with not(!)
        System.out.println(" ");
        if (!(age >= 18 && age <=35 && castedWeight < 90)) {
            System.out.println(" Not eligible");
        } else {
            System.out.println("Eligible");
        }

        //Categorize players by age:
        //• Under 20 → Rising Star
        //• 20–30 → Prime Player
        //• Over 30 → Veteran
        System.out.println(" ");
        String category = "";
        if (age < 20){
            category = "Rising star";
        } else if (age >=20 && age <= 30){
            category = "Prime player";
        } else if (age > 30){
            category = "Veteran";
        }
        System.out.println(category);
        // Switch case, breaks, default
        // • Ask the coach to enter the jersey number of the player.
        //• Write a switch using the jersey number entered (e.g., 1 = Goalkeeper, 2= defender, 6
        //= midfielder, 7 = Winger, 9 = Striker, 10 = Playmaker, 11 = Winger, 5- defender, 8 =
        //midfielder). Each case should print the player position.
        //• When the jersey number entered does not match any case, print “Player position not known
        System.out.println(" ");
        switch (jersey_number){
            case 1:
                System.out.println("Goalkeeper"); break;
            case 2:
                System.out.println("defender"); break;
            case 5:
                System.out.println("defender"); break;
            case 6:
                System.out.println("midfielder"); break;
            case 7:
                System.out.println("winger"); break;
            case 8:
                System.out.println("midfielder"); break;
            case 9:
                System.out.println("Striker"); break;
            case 10:
                System.out.println("playmaker"); break;
            case 11:
                System.out.println("winger"); break;
            default:
                System.out.println("Player position not found"); break;
        }
            // • Part A (Unwanted Fall-Through): Write a switch on jersey number. Remove breaks
            //for cases 2,6, and 7 and observe multiple lines printing. Don’t forget to include a
            //default case.
        System.out.println(" ");
        switch (jersey_number) {
                case 1:
                    System.out.println("Goalkeeper");
                    break;
                case 2:
                    System.out.println("defender");
                case 5:
                    System.out.println("defender");
                    break;
                case 6:
                    System.out.println("midfielder");
                case 7:
                    System.out.println("winger");
                case 8:
                    System.out.println("midfielder");
                    break;
                case 9:
                    System.out.println("Striker");
                    break;
                case 10:
                    System.out.println("playmaker");
                    break;
                case 11:
                    System.out.println("winger");
                    break;
                default:
                    System.out.println("Player position not found");
                    break;
        }

                //• Part B (Grouped Case – Useful Fall-Through): When we observe the switch cases
            //in Task 6, we see some of the cases can be grouped because they print the same thing.
            //Write a new switch case, grouping the cases that are the same and printing the player
            //position. Don’t forget to include a default case.
        System.out.println(" ");
        String position;
        switch (jersey_number) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "defender";
                break;
            case 6:
            case 8:
                position = "midfielder";
                break;
            case 7:
            case 11:
                position = "winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "playmaker";
                break;
            default:
                position = "Player position not found";
                break;
        } System.out.print(position);
        //Nested Ifs
        //Description: Select player for starting lineup. Rule: if category is Prime Player and weight <
        //80, then starting lineup; else bench.
        String lineup_decision = "";
        if (category=="Prime player") {
            if (castedWeight < 80) {
                lineup_decision = "starting lineup";
            } else {
                lineup_decision = "bench";
            } System.out.println(lineup_decision);
        }
        //Write a ternary expression for final decision using the eligibility condition in Task 4.
        //• Print result.
        String final_decision = (age >= 18 && age <=35 && castedWeight < 90)? "Play":"Rest";
        System.out.println(final_decision);

        // Attacker jersey
        String attacker_jersey;
        if (position == "Striker" || position == "winger"){
            attacker_jersey = "yes";
        } else{
            attacker_jersey = "No";
        }

         //Player Report
        System.out.println("");
        System.out.println("Player report");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + ", Category: " + category);
        System.out.println("Height: " + height + "cm");
        System.out.println("Weight: " + castedWeight + "kg");
        System.out.println("Jersey: " + jersey_number);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + attacker_jersey);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + lineup_decision);
        System.out.println("Final Decision: " + final_decision);
    }
}
