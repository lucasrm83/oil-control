import models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //production cost deve ser por ml, 50ml ou outra medida?
        //System.out.println("Digite o preço do kg da semente: ");
        //double precoKg = sc.nextDouble();
        double precoKg = 30.0;
        //System.out.println("Digite a quantidade em mls de óleo ao prensar 1kg da semente: ");
        //double quantidadeMl = sc.nextDouble();
        double quantidadeMl = 400.0;

        System.out.println("Qual o tipo de oleo?: ");
        System.out.println("1- Abacate, 2- Linhaça, 3- Girassol, 4- Abóbora");
        int tipo = sc.nextInt();
        Oil oil;
        if (tipo == 1){
            oil = new AvocadoOil(precoKg,quantidadeMl);
        } else if (tipo ==2) {
            oil = new LinhacaOil(precoKg,quantidadeMl);
        } else if (tipo ==3) {
            oil = new GirassolOil(precoKg,quantidadeMl);
        } else if (tipo == 4) {
            oil = new AboboraOil(precoKg,quantidadeMl);
        }else {
            System.out.println("Comando incorreto!");
            oil = new Oil(precoKg,quantidadeMl);
        }

        System.out.println(oil);
    }
}