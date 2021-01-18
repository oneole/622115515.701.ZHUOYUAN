public class Bird extends Pets {
    String country;
    String chirping;
    String fly;

    public Bird(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void ChekCountry(){
        System.out.println("My Birb country is "+ country);
    }
    public void chirping(){
        System.out.println("My bird  chirping  :"+ chirping);
    }
    public void itisfly(){
        if(fly.equals("Fly")){
            System.out.println("Is can fly : true");
        }else if(fly.equals("Notfly")){
            System.out.println("Is can fly : false");
        }
    }

}