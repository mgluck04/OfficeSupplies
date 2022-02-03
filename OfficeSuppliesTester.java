public class OfficeSuppliesTester{
    public static void main(String[] args) {
        //Stapler class tester
        Stapler s1 = new Stapler();

        System.out.println("Number of staples: " + s1.numStaples());
        System.out.println("Stapling 100 times...");
        for(int i = 0; i < 100; i++){
            s1.staple();
        }
        System.out.println("Number of staples: " + s1.numStaples());
        System.out.println("Refilling staples...");
        s1.refill();
        System.out.println("Number of staples:" + s1.numStaples());

        System.out.println("");
        //TallyCounter class tester
        TallyCounter t1 = new TallyCounter();
        System.out.println("Adding 80 to the tally counter...");
        for(int i = 0; i < 80; i++){
            t1.counterAdd();
        }
        System.out.println(t1.getCounter());

        System.out.println("");
        //CombinationLock class tester
        CombinationLock l1 = new CombinationLock(40, 32, 10);
        System.out.println("Is the lock open? " + l1.isLockOpen());
        System.out.println("First attempt to open lock... " + l1.unlock(80, 32, 20));
        System.out.println("Seconds attempt to open lock... " + l1.unlock(40, 32, 10));
        System.out.println("Is the lock open? " + l1.isLockOpen());
        System.out.println("Changing the lock combo...");
        l1.changeCode(30, 20, 10);
        System.out.println("Locking...");
        l1.lock();

    }


}