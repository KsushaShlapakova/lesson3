public class ProductNotValid extends Exception {
    private String message;

    ProductNotValid(String message){
        super();
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
