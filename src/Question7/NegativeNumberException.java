package Question7;

public class NegativeNumberException extends Exception {
    public NegativeNumberException()
    {
        super("Error! no negative number allowed");
    }

    public NegativeNumberException(String message)
    {
        super(message);
    }
}