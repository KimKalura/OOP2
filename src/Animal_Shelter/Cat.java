package Animal_Shelter;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("This is " + getName() + ";" +  " a " + getAge() + " years old cat. - Meow!");
    }
}
