package business;

import logic.*;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private final int MAX_STOCK = 500;
    private int totalStock;
    private double budget;
    private List<Toy> toys = new ArrayList<>();
    private Validates val = new Validates();

    public Inventory(){
        this.totalStock = 0;
        this.budget = 4000;
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

    public int fillStock(int amount){

        int availableStock;

        if(amount + totalStock <= MAX_STOCK){
            totalStock += amount;
            availableStock = MAX_STOCK - totalStock;
            System.out.println("Su stock total restante es de: " + availableStock);
            return amount;
        }

        availableStock = MAX_STOCK - totalStock;
        System.out.println("La cantidad excede al stock permitido");
        System.out.println("Su stock total restante es de: " + availableStock);
        return 0;

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

    public Toy searchToys(String model){

        for (Toy toy : toys) {
            if (toy.getModel().equalsIgnoreCase(model)) {
                return toy;
            }
        }
        return null;
    }


    public void addToys(){

        int opt;

        System.out.println("Por favor ingrese el numero de la opcion que desea ingresar: \n");
        System.out.println("1.-Muñecas\n");
        System.out.println("2.-Figuras de accion\n");
        System.out.println("3.-Legos\n");
        System.out.println("4.-Pistolas de juguete\n");

        opt = val.validateInt(">>");

        int stock = fillStock(val.validateInt("Por favor ingrese la canitdad disponible en stock\n"));
        double purchase = val.validateDouble("Por favor ingrese el precio al que se compra el producto\n");
        double salePrice = val.validateDouble("Por favor ingrese el precio de venta del producto\n");
        String tradeMark = val.validateStr("Por favor ingrese el nombre de la marca del producto\n");
        String model = val.validateStr("Por favor ingrese el modelo del producto");
        boolean available;

        available = stock >= 3;
        Toy toy = null;

        switch (opt){
            case 1:

                String universe = val.validateStr("Por favor ingrese al universo al que pertenece\n");
                toy = new Doll(stock, purchase, salePrice, tradeMark, available, model, universe);
                System.out.println("Objeto creado con exito:");
                showLastToy();
                break;
            case 2:

                int articulations = val.validateInt("Por favor ingrese el numero de articulaciones\n");
                toy = new ActionFigures(stock, purchase, salePrice, tradeMark, available, model, articulations);
                System.out.println("Objeto creado con exito:");
                showLastToy();
                break;
            case 3:

                String setType = val.validateStr("Por favor ingrese el nombre del set\n");
                int nParts = val.validateInt("Por favor ingrese el numero de piezas con las que cuenta el producto\n");
                toy = new Legos(stock, purchase, salePrice, available, tradeMark, model, setType, nParts);
                System.out.println("Objeto creado con exito:");
                showLastToy();
                break;
            case 4:

                String projectile = val.validateStr("Por favor ingrese el tipo de proyectil");
                toy = new ToyGuns(stock, purchase, salePrice, tradeMark, available, model, projectile);
                System.out.println("Objeto creado con exito:");
                showLastToy();
                break;

        }


    }

    public void showLastToy(){

        if(toys.isEmpty()){
            System.out.println("No hay juguetes registrados");
            return;
        }

        Toy toy = toys.get(toys.size() - 1);

        System.out.println("----------------------");
        if(toy instanceof Doll){
            Doll doll = (Doll) toy;
            doll.toString();
        }
         else if (toy instanceof Legos) {
            Legos lego = (Legos) toy;
            lego.toString();
        } else if (toy instanceof ActionFigures) {
            ActionFigures figure = (ActionFigures) toy;
            System.out.println("Articulaciones: " + figure.getArticulations());
            figure.toString();
        } else if (toy instanceof ToyGuns) {
            ToyGuns gun = (ToyGuns) toy;
            gun.toString();
        }
         System.out.println("----------------------");

    }

    @Override
    public String toString(){
        return "Stock maximo permitido: " + MAX_STOCK +
                "\nStock actual: " + totalStock +
                "\nPresupuesto actual: " + budget;
    }

}
