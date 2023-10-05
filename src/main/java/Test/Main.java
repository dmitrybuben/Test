package Test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AnimalRegister register = new AnimalRegister();
        Animal dog = new Animal("Barbos",new ArrayList<>());
        Animal cat = new Animal("Barsik", new ArrayList<>());

        register.addAnimal(dog);
        register.addAnimal(cat);

        register.listCommands(dog);
        register.teachAnimal(dog, "Sit");
        register.listCommands(dog);

    }
}
