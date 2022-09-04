package service;

import model.Food;
import model.Apple;

import static model.constants.Colour.COLOUR_GREEN;
import static model.constants.Colour.COLOUR_RED;


public class ShoppingCart {
   Food[] food;

   public ShoppingCart(Food[] food){
      this.food= new Food[3];
      for (int i=0; i< food.length ; i++) {
         this.food[i] = food[i];
      }
   }

   public double getCountFoodsNoSales() {
      double  getCountFoodsNoSales= 0;
       for (int i = 0; i < food.length; i++ ) {
          getCountFoodsNoSales += food[i].getAmount()*food[i].getPrice();
      }
       return getCountFoodsNoSales;

   }

   public double getCountFoodsSales(){
      double getCountFoodsSales = 0;
      for (int i = 0; i < food.length; i++ ) {
         if (food[i].getColour() == COLOUR_RED )
            getCountFoodsSales += food[i].getAmount() * food[i].getPrice() * food[i].getDiscount;
      }
      return getCountFoodsSales;
   }

   public double getCountVeganFoodsNoSales() {
      double getCountVeganFoodsNoSales = 0;
      for (int i = 0; i < food.length; i++ ) {
         if (food[i].getColour() == COLOUR_RED || food[i].getColour() == COLOUR_GREEN) {
            getCountVeganFoodsNoSales += food[i].getAmount()*food[i].getPrice();
         }
      }
      return getCountVeganFoodsNoSales;

   }
}
