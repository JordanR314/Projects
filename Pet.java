// Begins public class called Pet for later set and get methods
public class Pet {

    // Sets up the private data
    private String name;
    private String type;
    private int age;

    // Public constructor and setname method
    public Pet() {

        this.setName("Animal");
        this.setType("Animal");
        this.setAge(0);
        this.speak();
    }

    // Public definition of method to change to newname
    public void setName(String newName) {

        this.name = newName;
    }

    // Public definition of getname method to return the name of the Pet
    public String getName() {

        return this.name;
    }
    // Public definition of setType method to change to type
    public void setType(String newType){

        this.type = newType;
    }

    // Public definition of getType method to return the type of the Pet
    public String getType() {

        return this.type;
    }

    // Public definition of setAge method to return the type of the Pet
    public void setAge(int newAge) {

        this.age = newAge;
    }

    // Public definition of getAge method to return the age of the Pet
    public int getAge() {

        return this.age;
    }
    // Public custom method for speak
    public String speak() {
        if (this.type.equals("Dog")){
            return "Bark";
        }
        else if (this.type.equals("Cat")){
            return "Meow";
        }
        else {
            return "Noise";
        }
    }

    // Public definition of toString to attribute and concatenate the pet info string
    public String toString() {
        String output = "Pet Information:\nType: ";
        output += this.getType();
        output += "\nName: ";
        output += this.getName();
        output += "\nSound: ";
        output += speak();
        output += "\nAge: ";
        output += this.getAge();
        return output;
    }
}
