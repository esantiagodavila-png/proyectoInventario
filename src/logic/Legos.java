package logic;

public class Legos extends Toy{

    private String setType;
    private int nParts;

    public Legos(int stock, double price, boolean available,String model, String tradeMark, String setType, int nParts) {

        super(stock, price, tradeMark, available , model);
        this.setType = setType;
        this.nParts = nParts;

    }

    public String getSetType() {
        return setType;
    }

    public int getnParts() {
        return nParts;
    }
}
