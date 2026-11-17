package logic;

public class ToyGuns extends Toy{

    private String projectile;

    public ToyGuns(int stock, double price, String model, boolean available, String tradeMark, String projectile){

        super(stock, price, tradeMark, available, model);
        this.projectile = projectile;

    }

    public String getProjectile() {
        return projectile;
    }
}
