public class OfficeSuppliesTester{
    public static void main(String[] args) {
        Stapler s1 = new Stapler();

        System.out.println("Number of staples: " + s1.numStaples());
        System.out.println("Stapling 101 times...");
        for(int i = 0; i < 100; i++){
            s1.staple();
        }
        System.out.println("Number of staples: " + s1.numStaples());
        System.out.println("Refilling staples...");
        s1.refill();
        System.out.println("Number of staples:" + s1.numStaples());

    }


}