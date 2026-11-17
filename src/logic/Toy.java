package logic;

import business.Inventory;

import java.util.List;

public class Toy {

    private int stock;
    private double price;
    private String tradeMark;
    private boolean available;
    private String model;
    private List<Toy> toys;

    Inventory inv = new Inventory(toys);

    public Toy(int stock, double price, String tradeMark, boolean available, String model){
        this.stock = stock;
        this.price = price;
        this.tradeMark = tradeMark;
        this.available = available;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getModel() {
        return model;
    }

    public void sale(int amount){

        double earned = 0;

        if(amount <= stock){

            stock = stock - amount;
            earned = price * amount;
            System.out.println("Venta realizada con exito, gano: " + amount + " dolares\nle quedan: " + getStock() + getModel() + " en stock");
            inv.releaseStock(amount);

        }

    }

    public void buy(int amount){

        double toSpend ;
        toSpend = price * amount;

        if(inv.deductBudget(toSpend)){
            stock += amount;
            inv.fillStock(amount);
        }

    }

    public Toy searchToys(String model){

        for (Toy toy : toys) {
            if (toy.getModel().equalsIgnoreCase(model)) {
                return toy;
            }
        }
        return null;
    }
    
}
