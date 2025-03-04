package br.com.alura;

import br.com.alura.model.Product;
import br.com.alura.service.TranslateProductService;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Product> productList = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv"))
                .withType(Product.class).build().parse();

        TranslateProductService service = new TranslateProductService();

        for (Product product : productList) {
            service.translate(product);
        }

        for (Product product : productList) {
            System.out.println(product);
        }
    }
}