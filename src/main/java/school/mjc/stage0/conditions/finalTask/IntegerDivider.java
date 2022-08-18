package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
    int divisionResult = dividend / divider;
    int multiplyResult = divisionResult * divider
    
    if(multiplyResult == divisionResult * divider){
        System.out.println("can be divided completely");
    }
    else{
        System.out.println("cannot be divided completely");
    }
    }
}
