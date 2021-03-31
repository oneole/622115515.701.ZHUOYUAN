public class MountainBike extends Bicycle{
    int gear;
    
    public MountainBike (int speed) {
        super(speed);
    }
    
    public void gearset(int num) {
        gear = num;
        System.out.println("Change gear to " + num);
    }
    
    @Override
    public void speedup(){
        if (speed +5 * gear > 99) {
            speed = 99;
        } 
        else {
            speed += 5 * gear;
        }
        System.out.println("Speed up!");
    }
    
    @Override
    public void  breakNow(){
        speed -= 5;
        System.out.println("Break now!!!");
    }
}
