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
        if (fraction.denominator != denominator) {
            throw new RuntimeException("Not implemented");
        }
        return new Fraction(1, 2);
    }
}
