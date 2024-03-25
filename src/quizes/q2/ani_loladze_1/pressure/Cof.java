package quizes.q2.ani_loladze_1.pressure;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int totalExpenses = 5900 + 84 + 407 + 148 + 8100; // Total expenses in tetri

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, totalExpenses);
        System.out.println("Profit in laris: " + profit);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        int totalRevenue = pricePerCoffee * numCoffeeSold;
        double totalCost = totalCostOfBeans + (otherExpenses / 100.0); // Convert other expenses to laris

        double profitInTetri = totalRevenue - totalCost;

        return profitInTetri / 100.0;
    }
}
