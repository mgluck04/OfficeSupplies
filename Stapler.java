
public class Stapler {
    //fields
    private int staples = 0;

    
    //constructor
    public Stapler(){
        staples = 100;
    }

    //methods
    public void staple(){
         if(staples > 0){
            staples--;
         }else{
             System.out.println("No more staples left! Please refill.");
         }
    }

    public void refill(){
        staples = 100;
    }

    public int numStaples(){
        return staples;
    }


}
