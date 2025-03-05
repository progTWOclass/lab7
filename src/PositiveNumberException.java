import java.util.Scanner;
public class PositiveNumberException {

    public static int calculateAverage(int num){

        return (num += 0)/count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int result = 0;
        while(true){
            System.out.println("enter number");
            num = input.nextInt();
            if(num < 0){
                break;
            }
            calculateAverage(num);
        }
        System.out.println(result);
//        try{
//            int
//        }catch (){
//
//        }
    }
}
