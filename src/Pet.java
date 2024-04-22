public class Pet {
    String name;
    int age;
    String color;

    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Pet is eating");
    }

    public String speak() {
        return "Pet is speaking";
    }

}
