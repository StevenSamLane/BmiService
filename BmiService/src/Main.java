public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 90;
        double height = 1.70;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }

}