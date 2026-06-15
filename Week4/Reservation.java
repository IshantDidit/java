package Week4;
import java.util.Scanner;

public class Reservation {
    public static void availability(String bookingDate){
        String[] reservation={"2025-01-21","2025-01-23","2025-01-24","2025-01-29"};
        String[] booking={"2025-01-21","2025-01-23"};
        boolean isAvailable=false;
        //checking on reservation
        for (String date:reservation){
            if (date.equals(bookingDate)){
                isAvailable=true;
                break;

            }

        }
        if (isAvailable){
            boolean isBooked=false;
            //checking on booking
            for (String date:booking){
                if(bookingDate.equals(date)){
                    isBooked=true;
                    break;
                }
            }
            if(isBooked){
                System.out.println("already booked");
            }
            else{
                System.out.println("reservation done successfully");
            }
        }


        else{
            System.out.println("reservation not available in this date");
        }
    }
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your date");
        String inputdate = sc.nextLine();
        availability(inputdate);

    }
}
