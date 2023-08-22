package oops;

public class constructor {
    int x;

    public constructor(){
        x =2;

    }

    //Create the construcot for the class
    public static void main(String[] args) {
        constructor c = new constructor();//this will call the constructor
        System.out.println(c.x);
        
    }
    
}
