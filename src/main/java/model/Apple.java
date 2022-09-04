package model;

import static model.constants.Colour.COLOUR_RED;
import static model.constants.Discount.DISCOUNT;

public class Apple extends Food implements Discountable {
    protected String colour;

    protected Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
    }

    public boolean isVegetarian() {
        return true;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if(colour.equals(COLOUR_RED)) {
            return getPrice()*(1-DISCOUNT);
        } else
            return getPrice();
    }
}
