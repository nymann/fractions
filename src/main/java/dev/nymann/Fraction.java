package dev.nymann;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;
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

    public Fraction plus(Fraction fraction) {
        if (fraction.numerator == 0 && numerator == 0) {
            return new Fraction(0, 0);
        }
        if (fraction.denominator != denominator) {
            throw new RuntimeException("Not implemented");
        }
        var n = fraction.numerator + numerator;
        if (denominator % n == 0) {
            return new Fraction(1, denominator / n);
        }
        throw new RuntimeException("Not implemented");
    }
}
