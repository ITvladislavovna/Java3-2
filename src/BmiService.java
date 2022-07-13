public class BmiService {
    public double calculate(double weigh, double height) {
        double square = 2;
        double result = (weigh/Math.pow(height, square));
        return result;
    }
}
