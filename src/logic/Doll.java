package logic;

public class Doll extends Toy{

    private String universe;

    public Doll(int stock, double purchase, double salePrice ,String model, boolean available, String tradeMark , String universe) {

        super(stock, purchase, salePrice  ,tradeMark, available , model);
        this.universe = universe;
    }

    public String getUniverse() {
        return universe;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nUniverso: " + universe;
    }
}
