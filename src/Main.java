public class Main {
    public static void main(String[] args) {
        String a = new String("1234");
        char[] b = a.toCharArray();
        for (char each : b) {
            System.out.print(each);
        }
    }
}
