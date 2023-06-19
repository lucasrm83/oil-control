package models;

import enums.OilType;

public class Oil {
    protected Double pricePerKG;
    protected Double productionCosts =0.0;
    protected OilType oilType;

    protected Double volumeMl;

    public Oil(Double pricePerKG, Double volumeMl) {
        this.pricePerKG = pricePerKG;
        this.volumeMl = volumeMl;
    }

    public double priceMl(){
        return pricePerKG/volumeMl;
    }
    public double price50Mls(){
        return (priceMl()*50)+productionCosts;
    }
    public double price30Mls(){
        return (priceMl()*30)+productionCosts;
    }
    public double pricePerLiter(){
        return priceMl()*1000;
    }

    public double toOneLiter(){
        return 1/(volumeMl/1000);
    }
    public double profit50Mls(double price){
        return price-price50Mls();
    }

    public Double getPricePerKG() {
        return pricePerKG;
    }

    public void setPricePerKG(Double pricePerKG) {
        this.pricePerKG = pricePerKG;
    }

    public Double getProductionCosts() {
        return productionCosts;
    }

    public void setProductionCosts(Double productionCosts) {
        productionCosts = productionCosts;
    }

}
