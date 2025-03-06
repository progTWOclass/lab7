package Question6;

public class FileNotFoundException extends Exception{

    public FileNotFoundException(){
        super("File Not Found");
    }

    public FileNotFoundException(String message){
        super(message);
    }

}
