public class Celsius {
    public static void main(String[] args) {
        double celsius = 45;

        double calculo = (celsius * 1.8) + 32;

        int farenheit = (int) (calculo);

        System.out.println(farenheit);
    }
}
