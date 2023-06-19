package models;

public class AboboraOil extends Oil{

    public AboboraOil(Double pricePerKG, Double volumeMl) {
        super(pricePerKG, volumeMl);
        this.productionCosts = 6.0;
    }

}
