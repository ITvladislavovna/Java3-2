public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weigh = 57;
        double height = 1.67;
        double indexBMI = service.calculate( weigh, height);
        System.out.printf("Индекс массы тела:%.3f", indexBMI);
    }
}
