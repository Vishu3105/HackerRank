public class generics {
    public static <T> void printArray(T[] arr) {
        for(T e : arr) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Integer[] number = {1,2,3};
        String[] s = {"Hello", "World"};

        printArray(number);
        printArray(s);
    }
}
