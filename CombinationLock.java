public class CombinationLock {
    //fields
    private int num1;
    private int num2;
    private int num3;
    private boolean isOpen;

    //constructor
    public CombinationLock(int myNum1, int myNum2, int myNum3)
    {
        num1 = myNum1;
        num2 = myNum2;
        num3 = myNum3;
        isOpen = false;
    }

    //methods
    public void changeCode(int newNum1, int newNum2, int newNum3)
    {
        if(isOpen){
            num1 = newNum1;
            num2 = newNum2;
            num3 = newNum3;
        }else{
            System.out.println("You can not change the code as the lock is not open");
        }
    }

    public boolean unlock(int guess1, int guess2, int guess3){
        if(num1 == guess1 && num2 == guess2 && num3 == guess3){
            isOpen = true;
            return true;
        }
        return false;
    }

    public void lock(){
        isOpen = false;
    }

    public boolean isLockOpen(){
        return isOpen;
    }
}
