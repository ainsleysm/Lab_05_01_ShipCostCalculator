public class Main {
    public static void main(String[] args) {
        double price = 90.05;

        if (price >= 100) {
            System.out.println("Shipping cost is: $0.00");
            System.out.println("Your total cost is: $" + price);
        } else {
            double shipping = price * 0.02;
            double total = price + shipping;
            double roundShipping = Math.round(shipping * 100)/100D;
            double roundTotal = Math.round(total * 100)/100D;
            System.out.println("Shipping cost is: $" + roundShipping);
            System.out.println("Your total cost is: $" + roundTotal);
        }
    }
}