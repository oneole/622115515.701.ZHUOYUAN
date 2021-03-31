public class Bicycle {
    int speed;

    public Bicycle (int speed) {
        if (speed > 99)
            this.speed = 99;
        else
            this.speed = speed;
    }
    public void speedup() {
        if (speed + 5 > 99)
            speed = 99;
        else
            speed += 5;
        System.out.println("Speed up!");
    }

    public void breakNow(){
        speed -= 5;
        System.out.println("You need to break!");
    }

    public void speedcheck(){
        System.out.println("The bicycle's speed is " + speed);
    }
}
