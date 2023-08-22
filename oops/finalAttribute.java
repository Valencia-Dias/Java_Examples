// If you don't want the ability to override existing values, declare the attribute as final:

package oops;

public class finalAttribute {
    final int x = 2;   


    public static void main(String[] args) {
        finalAttribute obj = new finalAttribute();
        try{
            obj.x = 22;// will generate an error
        }
        catch(Exception e){
            System.out.println("Produces error "+ e.getMessage());
        }
    }
    
}
