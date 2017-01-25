package week1.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Alarm {
    public static void call (short callTime){
        if ((callTime >= 8) & (callTime < 21)) {
            System.out.println("Hello!");
        } else {
            System.out.println("Call again later pls, subscriber is offline!");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the hour of call: ");
        short hour = Short.parseShort(reader.readLine());
        if ((hour >= 0) & hour <= 24) {
            call(hour);
        }
        else {
            System.out.println("Enter valid time of call (0-24) pls!");
        }
        reader.close();
        // we can add construction 'while (true){...} if we don't want to stop procedure
        // before any exception will be thrown
    }
}
