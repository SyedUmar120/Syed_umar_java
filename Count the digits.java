import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 17723;
        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        System.out.println("Number of digits: " + count);
    }
}
