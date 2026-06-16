package Week7.errorHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {
    public void fileReader() throws FileNotFoundException{
        FileReader fileReader = new FileReader("test.txt");
    }

    static void main(String[] args) {
        ThrowsExample throwsExample = new ThrowsExample();
        try {
            throwsExample.fileReader();
        }catch (FileNotFoundException e){
            System.out.println("exception"+e.getMessage());
        }
    }
}
