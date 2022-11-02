package homework8;

public class Fraction {
    private int numerator = 0;
    private int denominator = 1;

    public double number;

    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }
    Fraction(int numerator){
        this.numerator=numerator;
    }

    Fraction(double number) {
        this.number=number;
    }



    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    private int getGcd() {
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    void normalize() {
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }
    public void sum(int numerator1, int denominator1, int numerator2, int denominator2){
        if(denominator1==denominator2){
            numerator=numerator1+numerator2;
            denominator=denominator1;
            normalize();
            System.out.println(numerator+"/"+denominator);
        }
        else{
            numerator=denominator1;
            denominator=denominator2;
            denominator= (denominator1*denominator2)/getGcd();
            numerator=(numerator1*(denominator/denominator1))+(numerator2*(denominator/denominator2));
            normalize();
            System.out.println(numerator+"/"+denominator);
        }
        }


    public void mult(int numerator1, int denominator1, int numerator2, int denominator2){
        numerator= numerator1*numerator2;
        denominator=denominator1*denominator2;
        normalize();

    }
}