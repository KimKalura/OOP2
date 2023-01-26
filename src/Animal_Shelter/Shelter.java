package Animal_Shelter;

public class Shelter {
    private Animal[] animals;
    private int numberOfAnimals = 0;

    public Shelter(Animal[] animals) {
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void makeNoise() {
        for (int i = 0; i < numberOfAnimals; i++) {
            animals[i].makeSound();
        }
    }

    public void addAnimal(Animal animal) {
        boolean canAddNewAnimal = true;
        if (numberOfAnimals >= animals.length) {
            canAddNewAnimal = false;
        }
        if (canAddNewAnimal) {
            animals[numberOfAnimals] = animal;
            numberOfAnimals++;
        }
    }
}
