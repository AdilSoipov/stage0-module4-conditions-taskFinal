package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (a + b <= c  a + c <= b  b + c <= a){
            return "it's not a triangle";
        }
        else{
            return "this is a valid triangle";
        }
    }
}
