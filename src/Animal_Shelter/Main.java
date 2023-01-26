package Animal_Shelter;
public class Main {
    public static void main(String[] args)  {
        Cat cat1 = new Cat("Findus", 2);
        //cat1.makeSound();
        Dog dog1 = new Dog("Toby", 1);
        //dog1.makeSound();

        Animal[] animals = new Animal[2];
        Shelter shelter = new Shelter(animals);
        shelter.addAnimal(cat1);
        shelter.addAnimal(dog1);
        shelter.makeNoise();
    }
}
