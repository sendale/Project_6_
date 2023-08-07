/*
 * Class: CMSC203
 * Instructor: Gary C. Thai
 * Description: (Give a brief description for each Class)
 * Due: 08/07/23
 * Platform/compiler: Intellij
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: _SaronEndale________
*/
public class Coffee extends Beverage{
    private boolean theExtraShot;
    private boolean theExtraSyrup;
    private final double SHOT_COST = 0.5;
    private final double SYRUP_COST = 0.5;

    //this is the constructor
    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        super(bevName, Type.COFFEE, size);
        this.theExtraShot = extraShot;
        this.theExtraSyrup = extraSyrup;
    }
    public double calcPrice() {
        double basePrice = super.getBasePrice();

        if (super.getSize() == Size.MEDIUM) {
            basePrice += super.getSizePrice();
        }
        else if (super.getSize() == Size.LARGE) {
            basePrice += 2 * super.getSizePrice();
        }

        if (theExtraShot) {
            basePrice += SHOT_COST;
        }
        if (theExtraSyrup) {
            basePrice += SYRUP_COST;
        }

        return basePrice;
    }
    public boolean equals(Beverage beverage) {
        Coffee coffee = (Coffee) beverage;
        if (super.equals(coffee) && theExtraShot ==coffee.getTheExtraShot() && theExtraSyrup ==coffee.getTheExtraSyrup()) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean getTheExtraShot() {
        return theExtraShot;
    }
    public boolean getTheExtraSyrup() {
        return theExtraSyrup;
    }
    public String toString() {
        String string = getBevName() +" , " +getSize();

        if (theExtraShot) {
            string += " Extra shot";
        }
        if (theExtraSyrup) {
            string += " Extra syrup";
        }

        string += ", $" +calcPrice();

        return string;
    }

    public void setTheExtraShot(boolean shot) {
        theExtraShot = shot;
    }
    public void setTheExtraSyrup(boolean syrup) {
        theExtraSyrup = syrup;
    }
}

