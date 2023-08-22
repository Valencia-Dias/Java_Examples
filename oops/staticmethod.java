package oops;

public class staticmethod {
    static void myMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
      }
    public static void main(String[] args) {
        myMethod();
        staticmethod s = new staticmethod();
        s.myPublicMethod();
        
    }
}
