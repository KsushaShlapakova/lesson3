import java.util.*;
public class ProductCatalog {
    HashMap<Long, Product>  products = new HashMap<Long, Product>();

    public List<Product> getAllProducts(){
        return new ArrayList<Product>(products.values());
    }

    public void createProduct(Product product) throws ProductAlreadyExists {
            if (products.containsKey(product.getId())) {
                throw new ProductAlreadyExists("Товар уже добавлен!");
            }else{
                products.put(product.getId(), product);
            }
}

    public void updateProduct(Product product) throws ProductNotValid, ProductNotFound {
        if (product.getName().equals("")) {
            throw new ProductNotValid("Нет имени!");
        }

        if (!products.containsKey(product.getId())){
            throw new ProductNotFound();
        }else{
            products.put(product.getId(), product);
        }
    }

    public void deleteProduct(long id) throws ProductNotFound{
        if (!products.containsKey(id)){
            throw new ProductNotFound();
        }else {
            products.remove(id);
        }
    }
}