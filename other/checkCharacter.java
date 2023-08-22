package other;

public class checkCharacter{
    public static void main(String[] args) {
        String c = "s*";
        String pattern= "^[a-zA-Z0-9]*$";
        System.out.println(c.matches(pattern));
        
    }

}