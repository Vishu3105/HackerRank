import java.util.Scanner;

public class stringtokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        x=x.trim();
        if (x.isEmpty()){
            System.out.println(0);
            return;
        }
        String[]tokens=x.split("[^a-zA-Z]+");
        System.out.println(tokens.length);
        for (String token:tokens){
            System.out.println(token);
        }
    }
}
