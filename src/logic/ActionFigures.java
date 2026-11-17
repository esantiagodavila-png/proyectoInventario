package logic;

public class ActionFigures extends Toy{

    private int articulations;


    public ActionFigures(int stock, double price,String model, boolean available, String tradeMark, int articulations) {

        super(stock, price, tradeMark, available ,model);
        this.articulations = articulations;

    }

    public int getArticulations() {
        return articulations;
    }

}
