public class AverageOfThree {

    // Method to calculate average
    static double findAverage(double a, double b, double c) {
        double sum = a + b + c;
        double avg = sum / 3;
        return avg;
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 30;

        double result = findAverage(a, b, c);

        System.out.println("Average: " + result);
    }
}