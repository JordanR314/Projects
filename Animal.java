// Sets up public class called Animal
public class Animal{
// Adds private data field
    private String species;
// 
    public Animal(){
        this.setSpecies("default");
    }

    public Animal(String newSpecies){
        this.setSpecies(newSpecies);
    }

    public void setSpecies(String newSpecies){
        this.species = newSpecies;
    }

    public String getSpecies(){
        return this.species;
    }

    public String toString(){
        String output = "Species: " + this.getSpecies();
        return output;
    }
}

