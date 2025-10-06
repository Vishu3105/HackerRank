public class Substrcompar {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest =s.substring(0,k);
        String largest = s.substring(0,k);

        for (int i=0;i<=s.length()-k;i++){
            String str=(s.substring(i,i+k));
            if(str.compareTo(smallest)<0){
                smallest=str;
            }if(str.compareTo(largest)>0){
                largest=str;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        System.out.println(getSmallestAndLargest(s, k));

    }
}
