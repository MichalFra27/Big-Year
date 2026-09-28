import java.util.Scanner;

public class userInterface {

    public userInterface() {

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        birdDataBase db = new birdDataBase();
        while(true) {

            System.out.print("Add - adds a bird\n" +
                    "Observation - adds an observation\n" +
                    "All - prints all birds\n" +
                    "One - prints one bird\n" +
                    "Quit - ends the program\n");
            String input = scanner.nextLine();
            if(input.equals("Add")) {
                // add bird
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName =  scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                db.addBird(bird);
            }
            else if(input.equals("Observation")) {
                // adds observation
                System.out.println("Bird: ");
                String name = scanner.nextLine();
                Bird bird = db.getBird(name);
                if(bird == null) {
                    System.out.println("Not a bird!");
                }
                else {
                    bird.addObservation();
                }
            }
            else if(input.equals("All")) {
                // prints all birds
                db.showBirds();
            }
            else if(input.equals("One")) {
                // prints one bird
                System.out.print("Bird: ");
                String name = scanner.nextLine();
                Bird result = db.getBird(name);
                if(result == null) {
                    System.out.println("Not a bird!");
                }
                System.out.println(result);
            }
            else if (input.equals("Quit")) {
                return;
            }
        }
    }
}
