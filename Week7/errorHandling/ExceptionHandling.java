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
        int[] numbers = {1,2,3,4,5};

        try {
            System.out.println(numbers[10]);
            int result = number / value;
            System.out.println("result" + result);

        }catch (ArithmeticException e){
            System.out.println("Exception"+e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception"+ e.getMessage());

        }catch (Exception e){
            System.out.println("exception"+e.getMessage());
        }finally {
            System.out.println("finally");
        }
    }
}
