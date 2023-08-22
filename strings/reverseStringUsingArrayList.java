
import java.util.ArrayList;

public class reverseStringUsingArrayList {
    public static void main(String[] args) {
        String b = "Java programming chapter";
        String []c = b.split(" ");
        ArrayList <String> al = new ArrayList <String>();
        for (String s3:c) {
             String rev = "";
            for( int i=0;i<s3.length();i++){
                rev = s3.charAt(i) + rev;    
         }
         al.add(rev);
        }
        System.out.println(al);
        String sf = String.join(" ", al);
        System.out.println(sf);
        
    }
}
