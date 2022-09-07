package PriceDisplay;

class PriceDisplay {
public static void main(String[] args) {
    String item = "Coffee machine";
    Double price = 15.99;
    
    // %.2f - sets the decimal places for the float format specifier
    System.out.printf("The price for the item %s is %.2f \n", item, price);
    
}
}
