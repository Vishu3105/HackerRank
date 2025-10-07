public class Stringreverse {
    public static void main(String[] args) {
        String x="madam";
        boolean ispal=true;
        for (int i=0,j=x.length()-1;i<j;i++,j--) {
            if (x.charAt(i) != x.charAt(j)) {
                ispal = false;
                break;
            }
        }
        System.out.println(ispal);
    }
}
