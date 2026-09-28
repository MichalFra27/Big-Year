import java.util.ArrayList;

public class birdDataBase {
    private ArrayList<Bird> birds;

    // constructor
    public birdDataBase() {
        this.birds = new ArrayList<>();
    }
    // adds a bird to the database
    public void addBird(Bird bird) {

        if(this.birds.isEmpty()) {
            this.birds.add(bird);
            return;
        }
        else if(this.birds.contains(bird)) {
            String search = bird.getName();
            Bird existing = getBird(search);
            existing.addObservation();
            return;
        }
        this.birds.add(bird);
    }

    // prints all birds
    public void showBirds() {
        for(Bird bird : this.birds) {
            System.out.println(bird);
        }
    }

    public Bird getBird(String name) {
        for(Bird bird : this.birds) {
            if(bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }


}
