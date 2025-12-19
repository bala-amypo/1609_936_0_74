package example.com.demo.exception;
//runtime exception time panna default la class erukku
public class validationException extends RuntimeException{
    //custom exception
    public validationException(String message){
        super(message);
    }
         


}