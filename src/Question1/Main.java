package Question1;

public class Main {
    public static void main(String[] args) {

        try{
            //gets the default message from the default constructor
            throw new FileNotFoundException();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());//a method part of exception class
            System.out.println("using the default constructor");
        }

        try{
            //using parameterized constructor
            throw new FileNotFoundException("different message");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("using the parameterized constructor");
        }
    }
}
