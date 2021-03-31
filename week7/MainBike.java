public class MainBike {
    public static void main (String[] args) {
        Bicycle bike1 = new Bicycle(10);
        MountainBike bike2 = new MountainBike(10);


        bike1.speedup();
        bike1.speedcheck();
        bike1.breakNow();
        bike1.speedcheck();

        System.out.println();

        bike2.gearset(2);
        bike2.speedup();
        bike2.speedcheck();
        bike2.breakNow();
        bike2.speedcheck();
    }
}
