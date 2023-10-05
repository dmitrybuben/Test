package Test;
import java.util.ArrayList;
import java.util.List;

public class AnimalRegister {
    private List<Animal> animalList;
    private int counter;

    public AnimalRegister() {
        animalList = new ArrayList<>();
        counter = 0;
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
        counter++;
    }

    public void teachAnimal(Animal animal, String newCommand) {
        animal.addCommand(newCommand);
        System.out.println(animal.getName() + " knows the command: " + newCommand);
    }

    public void listCommands(Animal animal) {
        System.out.println("Commands list for the animal: " + animal.getName());
        animal.listCommands();
    }
}
