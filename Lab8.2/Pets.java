public class Pets{
    String name;
    String species;
    String color;
    int age;

    public Pets(){

    }
    public Pets(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void intro() {
        System.out.print("Name is "+name);
        System.out.print(" Species : "+species);
        System.out.print(" Color : "+color);
        System.out.println(" Age : "+age);
    }
}