public class Student {
    String name;
    int age;
    double GPA;

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGPA() {
        return this.GPA;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this.name) {
            return true;
        }
        return this.getGPA() == ((Student) obj).getGPA();
    }

    /**public boolean equals(Object obj){
        if(obj == null){
            return false;
        }if(obj == this){
            return true;
        }
        return this.getAge()==((Student)obj).getAge() ;
    }*/

    /**public boolean equals(Object obj){
        if(obj == null){
            return false;
        }if(obj == this){
            return true;
        }
        return this.getName()==((Student)obj).getName() ;
    }*/
}