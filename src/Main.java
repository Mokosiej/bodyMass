public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 'x';
        int heightInMeters = 'y';
        int x = 98;
        double y = 1.87;
        int index = service.colculate(x, y);

        System.out.println(index);
    }
}