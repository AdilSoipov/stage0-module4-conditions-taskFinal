package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
    int result = divident / divider;
    
    if(result * divider == divident){
        System.out.println("can be divided completely");
    }
    else{
        System.out.println("cannot be divided completely");
    }
    }
}
