public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog("Lucky", "Pooddle", "brown", 2);
        dog.size = "Small";
        dog.bark = "wang wang";
        dog.hair = "Short hair";

        dog.intro();
        dog.Run();
        dog.Barksound();
        dog.itislonghair();

        Fish fish = new Fish("Lisa", "goldenfish", "yellow", 2);
        fish.size = "Big";
        fish.water = "sea water";
        fish.speed = "slow";

        fish.intro();
        fish.IsSwimToTheSea();
        fish.SwimFast();

        Bird bird = new Bird("Borden", "owl", "black", 4);

        bird.country = "USA";
        bird.chirping= "eww";
        bird.fly = "Fly";

        bird.intro();
        bird.chirping();
        bird.ChekCountry();
        bird.itisfly();


    }
}