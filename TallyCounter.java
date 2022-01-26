package OfficeSupplies;

public class TallyCounter {
    //fields
    private int counter;

    //constructor
    public TallyCounter()
    {
        counter = 0;
    }

    //methods
    public int counterAdd()
    {
        counter++;
        return counter;
    }
}
