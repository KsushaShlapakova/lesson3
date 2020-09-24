import java.util.Map;

public class Main {
    public static void main(String[] args) throws ProductAlreadyExists {
        ProductCatalog catalog = new ProductCatalog();

        Product first = new Product(1,"first", "T", "big");
        catalog.createProduct(first);

        Product second = new Product(2,"second", "Y", "big");
        catalog.createProduct(second);

        Product third = new Product(3,"third", "T", "small");
        catalog.createProduct(third);

        Product fourth = new Product(3,"", "T", "small");

        //Проверка на id
        System.out.println("Добавляю товар с таким же id");
        try {
            Product third2 = new Product(1,"third", "T", "small");
            catalog.createProduct(third2);

        } catch (ProductAlreadyExists e) {
            System.out.println(e.getMessage());
        }
        System.out.println(catalog.getAllProducts());
        System.out.println("");


        //Апдейт товара
        System.out.println("Изменяю товар");
        try{
            catalog.updateProduct(fourth);

        } catch (ProductNotValid e) {
            System.out.println(e.getMessage());
        }
        System.out.println(catalog.getAllProducts());
        System.out.println("");

        //Удаление твара
        System.out.println("Удаляю товар с несуществующим id");
        catalog.deleteProduct(120987654);
        System.out.println(catalog.getAllProducts());


    }
}
