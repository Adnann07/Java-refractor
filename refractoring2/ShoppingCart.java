/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refractoring2;

/**
 *
 * @author HP
 */
public class ShoppingCart
{
    public double calculateTotalPrice(int quantity, double pricePerItem, double taxRate, double discountRate )
    {
        double basePrice = calculateBasePrice(quantity,pricePerItem);
       double tax = calculateTax( basePrice,  taxRate);
       return basePrice + tax;
    }
    private double calculateBasePrice(int quantity, double pricePerItem)
    {
        return quantity*pricePerItem;
    }
    private double calculateTax(double basePrice,  double taxRate)
    {
          return basePrice * taxRate;
    }
   
}
