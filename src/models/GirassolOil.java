package models;

public class GirassolOil extends Oil{

    public GirassolOil(Double pricePerKG, Double productionCosts) {
        super(pricePerKG, productionCosts);
        productionCosts = 5.0;
    }
}
