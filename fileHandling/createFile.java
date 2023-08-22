package fileHandling;
import java.io.File;
public class createFile {
 
    public static void main(String[] args) {
      try{
          File myObj = new File("file1.txt");
        if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    }
    catch (Exception e){
        e.printStackTrace();

    }
      }
}
