public class Product {
    private long id;
    private String name;
    private String supplier;
    private String size;

    Product(long id, String name, String supplier, String size){
        this.id = id;
        this.name = name;
        this.supplier = supplier;
        this.size = size;
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSupplier(){
        return supplier;
    }
    public String getSize(){
        return size;
    }
}
