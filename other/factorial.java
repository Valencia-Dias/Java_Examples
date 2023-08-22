package other;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int fact = 1;
        if(num!=0 || num !=1){
            for(int i =2;i<=num;i++){
            fact = fact*i;
        }
    }
        else{
            fact = 1;
        }
            System.out.println(fact);

        }
        
    }
