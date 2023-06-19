package models;

public class AboboraOil extends Oil{

    public AboboraOil(Double pricePerKG, Double volumeMl) {
        super(pricePerKG, volumeMl);
        productionCosts = 6.0;
    }

}
