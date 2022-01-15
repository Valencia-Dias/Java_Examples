public class Main
{
	public static void main(String[] args) {
		String string1="Valencia";
        String reverse_string="";
        char c;
        for( int i=string1.length()-1;i>=0;i--)
        {
            c=string1.charAt(i);
            reverse_string+=c;
        }
        System.out.println(reverse_string);
	    }
}