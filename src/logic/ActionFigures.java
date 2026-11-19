package logic;

public class ActionFigures extends Toy{

    private int articulations;


    public ActionFigures(int stock, double purchase, double salePrice,String model, boolean available, String tradeMark, int articulations) {

        super(stock, purchase, salePrice  ,tradeMark, available , model);
        this.articulations = articulations;

    }

    public int getArticulations() {
        return articulations;
    }

    @Override
    public String toString(){

        return super.toString() +
                "\nNumero de articulaciones: " + articulations;
    }

}
