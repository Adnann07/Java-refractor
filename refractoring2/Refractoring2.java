/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refractoring2;

/**
 public class ShoppingCart {
    public double calculateTotalPrice(int quantity, double pricePerItem, double taxRate, double discountRate) {
        double tax = (quantity * pricePerItem) * taxRate;
        double discount = (quantity * pricePerItem) * discountRate;
        double total = (quantity * pricePerItem) + tax - discount;
        return total;
    }
}
 */
public class Refractoring2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShoppingCart cart=new ShoppingCart();
        double total=cart.calculateTotalPrice(2,100.0,0.08,0.1);
        System.out.println("total price: "+total);
    }
    
}

