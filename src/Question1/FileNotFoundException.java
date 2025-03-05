package Question1;

public class FileNotFoundException extends Exception{

    private String message;

    public FileNotFoundException(){
        super("File Not Found");
    }

    public FileNotFoundException(String message){
        super(message);
    }

}
