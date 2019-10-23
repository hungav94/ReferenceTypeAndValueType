package ValueType;

public class Main {
    public static void changeYear(int year) {
        year = 2000;
    }

    public static void main(String[] args) {
        int year = 0;
        changeYear(year);

        System.out.println(year);
    }
}
