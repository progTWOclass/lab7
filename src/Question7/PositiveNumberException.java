package Question7;

import java.util.Scanner;
public class PositiveNumberException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true){
            System.out.println("enter number (# to stop)");
            String stop = input.nextLine();
            if(stop.equals("#")){
                break;
            }
            try{
                //cast string into integer
                int num = Integer.parseInt(stop);
                if(num < 0){
                    throw new NegativeNumberException();
                }
                sum += num;
                count++;
            }catch(NegativeNumberException e) {
                System.out.println("you cannot enter a negative number");
            }catch (NumberFormatException e){
                System.out.println("this is not a number please enter a number");
            }
        }

        double average = (double) sum/count;
        System.out.printf("your total sum is %d \nyour average is %.2f", sum, average);
    }
}
