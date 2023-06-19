package models;

import enums.OilType;

public class Oil {
    protected Double pricePerKG;
    protected Double productionCosts = 0.0;
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
        return (priceMl()-productionCosts)*50;
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
        sb.append("Cada ml custa: "+ priceMl() +" Reais"+"\n");
        sb.append("O frasco com cinquenta Mls custam: "+price50Mls()+" Reais"+ "\n");
        sb.append("Um litro custa: "+pricePerLiter()+" Reais"+"\n" );
        sb.append("Para fazer um litro precisa de: "+toOneLiter()+ "Kgs"+"\n" );
        return sb.toString();
    }
}
