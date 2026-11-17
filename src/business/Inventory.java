package business;

import logic.Toy;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private final int MAX_STOCK = 500;
    private int totalStock;
    private double budget;
    private List<Toy> toys = new ArrayList<>();

    public Inventory(List<Toy> toys){
        this.totalStock = 0;
        this.budget = 4000;
        this.toys = toys;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public boolean fillStock(int amount){

        int availableStock;

        if(amount + totalStock <= MAX_STOCK){
            totalStock += amount;
            availableStock = MAX_STOCK - totalStock;
            System.out.println("Su stock total restante es de: " + availableStock);
            return true;
        }

        availableStock = MAX_STOCK - totalStock;
        System.out.println("La cantidad excede al stock permitido");
        System.out.println("Su stock total restante es de: " + availableStock);
        return false;

    }

    public void releaseStock(int amount){

        int availableStock ;
        totalStock -= amount;
        availableStock = MAX_STOCK - totalStock;
        System.out.println("Su stock total restante es de: " + availableStock);

    }


    public boolean deductBudget(double amount){

        if(amount <= budget){
            budget -= amount;
            System.out.println("Compra realizada con extio\nSu saldo restante es de: " + budget);
            return true;
        }

        System.out.println("Saldo insuficiente para realizar la compra");
        System.out.println("Su saldo restante es de: " + budget);
        return false;

    }

}
