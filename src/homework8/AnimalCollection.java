package homework8;

import java.util.ArrayList;
import java.util.LinkedList;

public class AnimalCollection {

    private LinkedList<String> animals;

    public ArrayList<String> getAnimals() {
        return new ArrayList<>(animals);
    }

    public AnimalCollection() {
        this.animals = new LinkedList<>();
    }

    public AnimalCollection(LinkedList<String> animals) {
        this.animals = new LinkedList<>(animals);  // Создаем копию
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public void removeAnimal() {
        if (!animals.isEmpty()) {
            animals.removeLast();
        }
    }
}
