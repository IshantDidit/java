package Week7.errorHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
    public void readFile() throws FileNotFoundException {
        FileReader fileReader=new FileReader("txt.txt");
    }
    static void main(String[] args){
        int number = 20;
        int value =0;

        try {


            int result = number / value;
            System.out.println("result" + result);

        }catch (ArithmeticException e){
            System.out.println("Exception"+e.getMessage());

        }
    }
}
