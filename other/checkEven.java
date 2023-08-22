package other;

import java.util.Scanner;

public class checkEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        if(num %2 ==0 || num ==0){
            System.out.println("NUmber is even");
        }
        else{
             System.out.println("NUmber is odd");
        }
        
    }
    
}
