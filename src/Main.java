public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Crow", "Latin crow");
        bird.addObservation();

        Bird bird1 = new Bird("Crow", "Latin crow");
        Bird bird2 = new Bird("Crow", "Latin crow");


        Bird bird3 = new Bird("Crow", "Latin crow");

        birdDataBase birds = new birdDataBase();
        birds.addBird(bird);
        birds.addBird(bird1);
        birds.addBird(bird2);
        birds.addBird(bird3);
        birds.showBirds();
    }
}