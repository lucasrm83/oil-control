package models;

public class LinhacaOil extends Oil{
    public LinhacaOil(Double pricePerKG, Double productionCosts) {
        super(pricePerKG, productionCosts);
        productionCosts = 4.0;
    }
}
