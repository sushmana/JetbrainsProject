// Don't delete scanner import
import javax.naming.spi.DirStateFactory;
import java.sql.SQLOutput;
import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String FirstName = scanner.next();
        String LastName = scanner.next();
        System.out.println(createFullName(FirstName, LastName));
    }
    public static String createFullName(String a,String b) {
        return (a+" "+b);
    }
}



