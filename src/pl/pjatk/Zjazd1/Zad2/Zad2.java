package pl.pjatk.Zjazd1.Zad2;

public class Main {

    public static void main(String[] args) {
        double a = 20;
        double b = 40;
        double res = (a+b)*100;
        boolean wynik = (res % 40.0d) == 0;
        if (!wynik) {
            System.out.println("Modulo higher than 0");
        }
    }
}
