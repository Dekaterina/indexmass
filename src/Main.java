public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 65; // вес в килограммах
        double height = 1.7; // рост в метрах
        int index = service.calculate(weight, height );
        System.out.println(index);
    }
}
