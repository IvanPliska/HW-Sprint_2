package model;

public abstract class Food {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    protected Food (int amount, double price) {
        this.amount=getAmount();
        this.price=getPrice();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }
}
