package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = leia.nextLine();

        System.out.println("Price: ");
        product.price = leia.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = leia.nextInt();

        System.out.println(product);



        leia.close();
    }
}
