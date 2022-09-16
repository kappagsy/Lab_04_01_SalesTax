public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 20.00;
        double salesTax;
        double totalCost;

        salesTax = purchasePrice * 0.05;
        System.out.println("The price of your purchase is " + purchasePrice + ", and the sales tax on your purchase is: " + salesTax);
        totalCost = purchasePrice + salesTax;
        System.out.println("The total cost of your purchase is " + totalCost);


    }
}