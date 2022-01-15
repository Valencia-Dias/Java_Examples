public class Main
{
	public static void main(String[] args) {
		String s="Valencia";
        String rev="";
        char c;
        for( int i=s.length()-1;i>=0;i--)
        {
            c=s.charAt(i);
            rev+=c;
        }
        System.out.println(rev);
	    }
}