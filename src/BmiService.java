public class BmiService {
    public int colculate(int weightInKg, double heightInMeters) {
        return (int) (weightInKg / heightInMeters / heightInMeters);
    }
}
