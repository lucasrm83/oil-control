package service;

import models.AboboraOil;
import models.AvocadoOil;
import models.Oil;

public class OilService {
    public static void relatorio(Oil oil){
        StringBuilder sb = new StringBuilder();
        sb.append("Cada ml custa: "+ oil.priceMl() +" Reais"+"\n");
        sb.append("O frasco com 50Mls custa: "+oil.price50Mls()+" Reais"+ "\n");
        sb.append("Um litro custa: "+oil.pricePerLiter()+" Reais"+"\n" );
        sb.append("Para fazer um litro precisa de: "+oil.toOneLiter()+ "Kgs"+"\n" );
        if (oil instanceof AvocadoOil || oil instanceof AboboraOil){
            sb.append("O frasco com  30Mls custa: "+oil.price30Mls()+" Reais"+ "\n");
        }
        System.out.println(sb.toString());

    }
}
