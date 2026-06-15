package Week7.ResturantReservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Reservation {
    private ArrayList<String> reservationArr = new ArrayList<>(Arrays.asList("2025-01-21", "2025-01-23", "205-01-24", "2025-01-29"));

    private ArrayList<String> bookedDates = new ArrayList<>();

    public void checkAvailability(String inputDate) {
        if(reservationArr.contains(inputDate)){
            if(!bookedDates.contains(inputDate)){
                bookedDates.add(inputDate);
                System.out.println("your booking complteled successfully");
            }
            else{
                System.out.println("already booked in this date");
            }

        }
        else{
            System.out.println("booking no here");
        }

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reservation reservation = new Reservation();
        boolean isEnd = false;

        while (!isEnd){
            System.out.println("choose option");
            System.out.println("1. Booking");
            System.out.println("2. Exit");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1 ->{
                    System.out.println("enter date for booking");
                    String inputDate = sc.nextLine();
                    reservation.checkAvailability(inputDate);
                }
                case 2 ->{
                    isEnd=true;
                    System.out.println("exiting... ");
                }
                default -> System.out.println("invalid");
            }
        }


    }
}


