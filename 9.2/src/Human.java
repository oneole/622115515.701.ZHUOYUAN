public class Human{
    public void hit(Animal animal) {
        System.out.println(animal.roar());

    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Human human = new Human();
        Animal fish = new Fish();
        System.out.println("The first calling hit(dog)");
        human.hit(dog);


        System.out.println("The second calling hit(cat)");
        human.hit(cat);

        System.out.println("The third calling hit(fish)");
        human.hit(fish);
    }
}