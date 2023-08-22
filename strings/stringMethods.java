
public class stringMethods {
    
    public static void main(String[] args) {
        String s = "welcome";
        System.out.println("Length of teh string " + s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf('o'));

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
        String[] s1 = txt.split("");
        System.out.println(s1);
        for(String a:s1){
           // System.out.println(a);
        }
        System.out.println(s1[9]);


        
    }
}
