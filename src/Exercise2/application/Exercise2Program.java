package Exercise2.application;

import Exercise2.entities.ImportedProduct;
import Exercise2.entities.Product;
import Exercise2.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Exercise2Program {
    public static void main(String[] Args){

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the quantity of products: ");
        int quantity = sc.nextInt();
        List<Product> products = new ArrayList<>();

        for(int i = 1; i <= quantity; i++){
            System.out.print("Common, used or imported? (c/u/i): ");
            char productCondition = sc.next().charAt(0);

            while(productCondition != 'c' & productCondition != 'u' && productCondition != 'i'){
                System.out.print("Enter a valid option. Common, used or imported? (c/u/i): ");
                productCondition = sc.next().charAt(0);
            }
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextInt();

            if(productCondition == 'c'){
                products.add(new Product(name, price));

            } else if (productCondition == 'u') {
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), fmt);
                products.add(new UsedProduct(name, price, manufactureDate));

            } else {
                System.out.print("Custom fee: ");
                Double customFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
            }
        }

        System.out.println("PRICE TAGS: ");
        for(Product p : products){
            System.out.println(p.priceTag());
        }


    }
}
