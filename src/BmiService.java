public class BmiService {

    public int calculate(double weight, double height) {
        double bmi = weight / (height * height);
        int roundedBmi = (int) bmi;
        return roundedBmi;
    }

}