public class Cat extends Pet {
    String breed;

    public Cat(String name, String breed, int age, String color) {
        super(name, age, color);
        this.breed = breed;
    }

    @Override
    public String speak() {
        return "Meow";
    }

    public boolean isCatPlaying(int temperature) {
        if (temperature >= 25 && temperature <= 45) {
            return true;
        } else {
            return false;
        }
    }

}
