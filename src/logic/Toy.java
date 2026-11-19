package logic;

import business.Inventory;

import java.util.List;

public class Toy {

    private int stock;
    private double purchase;
    private double salePrice;
    private String tradeMark;
    private boolean available;
    private String model;


    Inventory inv = new Inventory();

    public Toy(int stock, double purchase, double salePrice, String tradeMark, boolean available, String model){
        this.stock = stock;
        this.purchase = purchase;
        this.salePrice = salePrice;
        this.tradeMark = tradeMark;
        this.available = available;
        this.model = model;
    }

    public double getpurchase() {
        return purchase;
    }

    public  double getSalePrice(){
        return salePrice;
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

    public void sale(int amount, Inventory inv){

        double earned = 0;

        if(amount <= stock){

            stock = stock - amount;
            earned = salePrice * amount;
            System.out.println("Venta realizada con exito, gano: " + amount + " dolares\nle quedan: " + getStock() + getModel() + " en stock");
            inv.releaseStock(amount);

        }

    }

    public void buy(int amount , Inventory inv){

        double toSpend ;
        toSpend = purchase * amount;

        if(inv.deductBudget(toSpend)){
            stock += amount;
            inv.fillStock(amount);
        }

    }

    @Override
    public String toString() {
        return "Modelo: " + model +
                "\nMarca: " + tradeMark +
                "\nPrecio de venta: " + salePrice +
                "\nPrecio de compra: " + purchase +
                "\nStock: " + stock +
                "\nDisponoble: " + (available ? "Si" : "No");

    }

}
