package oops;

public class MethodOverloading {

    static int addNum(int a, int b) {
        return a + b;
    }

    static double addNum(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {
        int intResult = addNum(2,3);
        double doubleResult = addNum(2.345666, 3.456);
        System.out.println("Integer addition result-" +intResult+" "+"Double addition result-"+doubleResult);
        
    }

}
