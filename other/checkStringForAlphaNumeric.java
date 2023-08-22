package other;
import java.util.Scanner;

public class checkStringForAlphaNumeric {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        s.close();
        if (s1.matches("[a-zA-Z0-9]+"))
        {
            System.out.println("Has alphanumeric");
        }
        else{
             System.out.println("Not alphanumeric");
        }
    }
    
}
