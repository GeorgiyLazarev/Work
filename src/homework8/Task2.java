package homework8;

/**
 * Задача 2:
 * Создать класс, который будет хранить в себе коллекцию с названиями
 * животных. Реализовать методы удаления и добавления животных по
 * следующим правилам: добавляется всегда в начало коллекции, а удаляется
 * всегда из конца. Показать работу объекта этого класса в main методе другого
 * класса.
 */

public class Task2 {
    public static void main(String[] args) {
        AnimalCollection animalCollection = new AnimalCollection();
        animalCollection.addAnimal("Коза1");
        System.out.println(animalCollection.getAnimals());
        animalCollection.addAnimal("Коза2");
        animalCollection.addAnimal("Коза3");
        animalCollection.addAnimal("Коза4");
        animalCollection.removeAnimal();
        System.out.println(animalCollection.getAnimals());
    }
}
