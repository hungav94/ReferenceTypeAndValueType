package ReferenceType;

public class Year {
    private int year = 1;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Year y = new Year();
        y.setYear(2019);
        System.out.println(y.year);
    }
}
