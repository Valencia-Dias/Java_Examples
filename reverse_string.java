public class Main
{
	public static void main(String[] args) {
		String string1="Valencia";
        String reverse_string="";
        char c;
        for( int i=0;i<string1.length();i++)
        {
            c=string1.charAt(i);
            reverse_string=c+reverse_string;
        }
        System.out.println(reverse_string);
	    }
}