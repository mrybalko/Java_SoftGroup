package week2.homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StaffBounty {

    public static List<String> staff = new ArrayList<>();

    public static int staffBounty(){
        Random r = new Random();
        int random = r.nextInt(staff.size());
        return random;
    }

    public static void main(String[] args) throws IOException {
        staff.add("Ivanov Ivan");
        staff.add("Petrov Petr");
        staff.add("Bogdanov Bogdan");
        staff.add("Alexeev Alexey");
        staff.add("Georgiev Georgiy");
        staff.add("Fedorov Fedor");
        staff.add("Kirillov Kirill");

        System.out.printf("This month winner is %s", staff.get(staffBounty()));

    }
}
