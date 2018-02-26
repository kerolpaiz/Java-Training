import java.io.File;
import java.text.SimpleDateFormat;
 
public class FileLastModified {
     
    public static void main(String a[]) {
         
        File file = new File("input.txt");
        System.out.println(file.lastModified());

	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	System.out.println("After Format : " + sdf.format(file.lastModified()));
    }
 
}