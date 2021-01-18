public class Fish extends Pets{
    String size ;
    String water;
    String speed;

    public Fish(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void IsSwimToTheSea(){
        System.out.println("My Fish "+ name +" Swim to the "+water);
    }
    public void SwimFast(){
        if(speed.equals("Fast")){
            System.out.println("Speed Fast : true");
        }else if(speed.equals("Slow")){
            System.out.println("Speed Fast : false");
        }
    }
}