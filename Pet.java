public class Pet {

    private String name;

    public Pet() {
        this.setName("Pet Name");
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }
    public String toString() {
        String output = "Pet Information:\nPet name: ";
        output += this.getName();
        return output;
    }
    public static void main(String[] args) {

        Pet Pet1 = new Pet();
        System.out.println(Pet1);

        Pet Pet2 = new Pet();
        Pet2.setName("Davy");
        System.out.println(Pet2);
    }
}
