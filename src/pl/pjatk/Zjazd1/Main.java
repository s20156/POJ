package pl.pjatk.Zjazd1;

public class Main {

    public static void main(String[] args) {
        int myFirstNumber = 35;
        String myNull = null;


        //Null moze byc tylko przypisany do typu złożonego, bo PROSTE MUSZA MIEC WARTOSC


        System.out.println("Hello, PJATK");
        String example = "Hello PJATK";
        System.out.println(example);


        int mySecondNumber = Integer.MAX_VALUE;
        int myThirdNumber = Integer.MIN_VALUE;

        System.out.println(myThirdNumber);
        System.out.println("Max val of integer is: " + mySecondNumber);

        byte myMinValByte = Byte.MIN_VALUE;
        byte myMaxValByte = Byte.MAX_VALUE;

        System.out.println(myMinValByte);
        System.out.println(myMaxValByte);

        short myMinValShort = Short.MIN_VALUE;
        short myMaxValShort = Short.MAX_VALUE;

        System.out.println(myMaxValShort);
        System.out.println(myMinValShort);



        byte a = 68;
        short b = 267;
        int c = -637;

        long i = (long) (50000 + 10 * (a + b + c));

        System.out.println(i);



        short bigShortValue = 56735;
        int myTotal = (myMaxValByte / 2);

        short myNewShortValue = (short) myTotal;
        System.out.println(myNewShortValue);

        boolean isReady = true;
        if (isReady){
            System.out.println(isReady);
        } else {
            System.out.println("NOT");
        }

        String not = "Not";

        int isReady2;

        //Ternary operator

        isReady2 = not.equals(not) ? 1 : 0;

        System.out.println(isReady2);





        double a = 20;
        double b = 40;
        double res = (a+b)*100;
        boolean wynik = (res % 40.0d) == 0;
        if (!wynik) {
            System.out.println("Modulo higher than 0");
        }
    }
}
