public class Programmar extends Person {
    String programmar;
    public Programmar (String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void PC(){
        System.out.println(name+" is "+programmar+" chef ");
    }
}
