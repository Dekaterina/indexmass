public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 65.5; // вес в килограммах
        double height = 1.7; // рост в метрах
        double index = service.calculate(weight, height );
        System.out.println(index);
    }
}
