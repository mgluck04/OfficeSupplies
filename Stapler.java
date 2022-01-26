package OfficeSupplies;

public class Stapler {
    
    private int staples = 0;


    public Stapler(){


        staples = 100;
    }
    public int staple(int num){
        return staples += num;
    }


}
