package logic;

public class Doll extends Toy{

    private String universe;

    public Doll(int stock, double price,String model, boolean available, String tradeMark , String universe) {

        super(stock, price, tradeMark, available, model);
        this.universe = universe;
    }

    public String getUniverse() {
        return universe;
    }
}
