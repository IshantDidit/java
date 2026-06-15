package Week3;

public class BreakAndContinue {
    static void main(String[] args) {
        // 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                //break;
                continue;
            }
            System.out.println(i);
        }
    }
}
