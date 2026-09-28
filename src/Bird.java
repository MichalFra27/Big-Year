public class Bird {
    private String name;
    private String latinName;
    private int observations;


    // constructor
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    // getter methods

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void addObservation() {
        this.observations += 1;
    }

    @Override
    public String toString() {
        return this.name + ", Latin: " + this.latinName +  ", Observations: " + this.observations;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(!(obj instanceof Bird)) return false;

        Bird birdObj = (Bird) obj;
        if(this.name.equals(birdObj.name) && this.latinName.equals(birdObj.latinName)) return true;

        return false;
    }
}
