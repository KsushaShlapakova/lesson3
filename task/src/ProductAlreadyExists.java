public class ProductAlreadyExists extends Exception{
    private String message;

    ProductAlreadyExists(String message){
        super();
        this.message = message;
    }
    ProductAlreadyExists(){
        super();
        this.message = "Товар уже добавлен!";
    }

    public String getMessage(){
        return message;
    }
}
