package other;

public class swapWithThirdVariable {
    public static void main(String[] args) {
        float a = 2;
        float b = 3.55f;
        float temp;
        System.out.println("a and b before swapping " + a +" "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("a and b after swapping " + a +" "+b);
    }
    
}
