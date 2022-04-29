package contacts;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringJmsReceiverApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringJmsReceiverApplication.class, args);
    }


    public static int arrayQuestion(int[] arr) {
        if (arr.length == 0)
            return 0;
        if (arr.Length == 1)
            return 1;

        var sum = 0;
        for (int i = 0; i < arr.Length; i++) {
            sum += arr[i];
        }

        var avg = sum / arr.Length;
        var foundOnce = false;

        for (int i = 0; i < arr.Length; i++) {
            if (arr[i] == avg) {
                if (foundOnce)
                    return 0;
                else
                    foundOnce = true;
            }
        }

        if (!foundOnce)
            return 0;

        var numBelow = 0;
        var numAbove = 0;
        for (int i = 0; i < arr.Length; i++) {
            if (arr[i] < avg)
                numBelow++;
            if (arr[i] > avg)
                numAbove++;
        }

        if (numAbove == numBelow)
            return 1;

        return 0;
    }

    public static int CommonFactors(int x, int y) {
        for (int i = 2; i <= x; i++) {
            int xDec;
            Math.DivRem(x, i, out xDec);
            if (xDec == 0) {
                int yDec;
                Math.DivRem(y, i, out yDec);
                if (yDec == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}