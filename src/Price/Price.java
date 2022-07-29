package Price;


//Создайте проект, используя IntelliJ IDEA. Требуется: Описать класс с именем Price, содержащую следующие поля:
//  название товара;
//  название магазина, в котором продается товар;
//  стоимость товара в гривнах.
// Написать программу, выполняющую следующие действия:
//  ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны быть упорядочены в алфавитном порядке по названиям магазинов);
//  вывод на экран информации о товарах, продающихся в магазине, название которого введено с клавиатуры (если такого магазина нет, вывести исключение).
public class Price implements Comparable<Price> {
    private String shopName;
    private String productName;
    private int priceUAH;

    public Price( String shopName,String productName, int priceUAH) {
        this.shopName = shopName;
        this.productName = productName;
        this.priceUAH = priceUAH;


    }

    public String getShopName() {
        return shopName;
    }

    public String getProductName() {
        return productName;
    }


    public int getPriceUAH() {
        return priceUAH;
    }

    @Override
    public int compareTo(Price o) {
        return shopName.compareTo(o.getShopName());


    }

    @Override
    public String toString() {
        return "Price{" +
                ", shopName='" + shopName + '\'' +
                "productName='" + productName + '\'' +
                ", priceUAH=" + priceUAH +
                '}' + '\n';
    }
}

