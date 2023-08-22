
public class countWords {
    public static void main(String[] args) {
        String s = "hi this is val";
        String[] s1 = s.split(" ");
        System.out.println(s1.length);
        //or
        int countwords = s.split(" ").length;
        System.out.println(countwords);

        
    }
    
}
