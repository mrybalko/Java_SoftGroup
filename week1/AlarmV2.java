package week1.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AlarmV2 {
    public void call() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the hour of call: ");
        short hour = Short.parseShort(reader.readLine());
        if ((hour >= 0) & hour <= 24) {
            if ((hour >= 8) & (hour < 21)) {
                System.out.println("Hello!");
            } else {
                System.out.println("Call again later pls, subscriber is offline!");
            }
        } else {
            System.out.println("Enter valid time of call (0-24) pls!");
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        AlarmV2 caller = new AlarmV2();
        caller.call();

    }
}
