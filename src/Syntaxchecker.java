import java.util.Scanner;
import java.util.regex.Pattern;

public class Syntaxchecker {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int testcases=Integer.parseInt(sc.nextLine());
        while (testcases>0){
            String x=sc.nextLine();
            try{
                Pattern.compile(x);
                System.out.println("Valid");
            }catch (Exception e){
                System.out.println("Invalid");
            }
            testcases--;
        }
    }
}
