package dev.nymann;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        int gcd = 1;
        if (denominator > 0) {
            gcd = this.greatestCommonDivisor(numerator, denominator);
        }
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    private int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fraction fraction = (Fraction) obj;
        return fraction.numerator == numerator && fraction.denominator == denominator;
    }

    public Fraction plus(Fraction that) {
        if (that.numerator == 0 && numerator == 0) {
            return new Fraction(0, 0);
        }
        if (that.denominator == 0 || denominator == 0) {
            throw new ZeroDivisionError();
        }

        return new Fraction(this.numerator * that.denominator + this.denominator * that.numerator, this.denominator * that.denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
