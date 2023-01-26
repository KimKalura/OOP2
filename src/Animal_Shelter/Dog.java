package Animal_Shelter;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("This is " + getName() + ";" +  " a " + getAge() + " years old dog. - Ham!");
    }
}
