package Price;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Price price = new Price("Tesco", "Tea", 40);
        Price price1 = new Price("Lidl", "Milk", 20);


        System.out.println("Введите название магазина:");


        String shopName = scanner.nextLine();
        if (shopName.equals("Tesco"))
            System.out.println(price.getProductName()+" - "+"название продукта" + "   " + price.getPriceUAH()+" - "+"цена");

        String shopName1 = scanner.nextLine();

        if (shopName1.equals("Lidl"))
            System.out.println(price1.getProductName()+" - "+"название продукта" + "   " + price1.getPriceUAH()+" - "+"цена");

        else {
            System.out.println("Такого магазина нет");


            ArrayList<Price> something = new ArrayList<>();
            something.add(price);
            something.add(price1);


            Collections.sort(something);


        }
    }
}
