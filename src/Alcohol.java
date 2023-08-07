/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 08/07/23
 * Platform/compiler: Intellij
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: __Saron Endale________
*/

public class Alcohol extends Beverage {
    private boolean isWeekend;
    private final double WEEKEND_FEE = 0.6;
    public Alcohol(String bevName, Size size, boolean isWeekend) {
        super(bevName, Type.ALCOHOL, size);
        this.isWeekend = isWeekend;
    }

    public double calcPrice() {
        double basePrice = super.getBasePrice();

        if (super.getSize() == Size.MEDIUM) {
            basePrice += super.getSizePrice();
        } else if (super.getSize() == Size.LARGE) {
            basePrice += 2 * super.getSizePrice();
        }

        if (isWeekend) {
            basePrice += WEEKEND_FEE;
        }

        return basePrice;
    }

    public String toString() {
        String string = getBevName() + ", " + getSize();

        if (isWeekend) {
            string += " Weekend";
        }

        string += ", $" + calcPrice();

        return string;
    }

    @Override
    public boolean equals(Beverage beverage) {
        Alcohol al = (Alcohol) beverage;
        if (super.equals(al) && getIsWeekend() == al.getIsWeekend()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean getIsWeekend() {
        return isWeekend;
    }
    public void setIsWeekend(boolean is) {
        isWeekend = is;
    }
}
