package models;

import enums.OilType;

public class Oil {
    private Double pricePerKG;
    private Double productionCosts;
    private OilType oilType;

    private Double volumeMl;

    public Oil(Double pricePerKG, Double productionCosts) {
        this.pricePerKG = pricePerKG;
        productionCosts = productionCosts;
    }

    public double priceMl(){
        return pricePerKG+productionCosts/volumeMl;
    }
    public double price50Mls(){
        return priceMl()*50;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cada ml custa: "+ priceMl() +"\n");
        sb.append("Cinquenta Mls custam: "+price50Mls()+ "\n");
        sb.append("Um litro custa: "+toOneLiter()+"\n" );
        return sb.toString();
    }
}
