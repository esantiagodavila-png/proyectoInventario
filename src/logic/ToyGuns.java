package logic;

public class ToyGuns extends Toy{

    private String projectile;

    public ToyGuns(int stock, double purchase, double salePrice , String model, boolean available, String tradeMark, String projectile){

        super(stock, purchase, salePrice  ,tradeMark, available , model);
        this.projectile = projectile;

    }

    public String getProjectile() {
        return projectile;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nProyectil: " + projectile;
    }

}
