package FWK;

public class EdadMenosCeroException extends Exception{

    public EdadMenosCeroException(){}
    public EdadMenosCeroException(String message){
        super(message);
       // System.out.println(getMessage());
    }
    public EdadMenosCeroException(Throwable cause){
        super(cause) ;
    }
    public EdadMenosCeroException(String message, Throwable cause){
        super(message, cause);
    } 
}
