package other;

public class swapWithoutThirdVariable {
    public static void main(String[] args) {
        float a = 2;
        float b = 3.5f;
        System.out.println("a and b before swapping " + a +" "+b);
        a = a + b;
        b = a -b;
        a = a-b;
        System.out.println("a and b after swapping " + a +" "+b);


        
    }
    
}
