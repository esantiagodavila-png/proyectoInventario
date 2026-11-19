package logic;

public class Legos extends Toy{

    private String setType;
    private int nParts;

    public Legos(int stock, double purchase, double salePrice ,boolean available,String model, String tradeMark, String setType, int nParts) {

        super(stock, purchase, salePrice  ,tradeMark, available , model);
        this.setType = setType;
        this.nParts = nParts;

    }

    public String getSetType() {
        return setType;
    }

    public int getnParts() {
        return nParts;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCantidad de piezas: " + nParts +
                "\nTipo de set: " + setType;
    }
}
