package week2.homework;

import java.io.*;
import java.util.*;

public class Staff {
    private int id;
    private int key;
    private static Map<Integer, String> staff = new HashMap<>();

    private void addStaff() throws IOException {
        System.out.print("Add the name pls: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (name.isEmpty()){
            System.out.println("List filled in!");
        }else {
            id++;
//          int id = name.hashCode();
            staff.put(id, name);
            addStaff();
        }

    }
    public void getByID (int id) {
        for (Map.Entry<Integer, String> entry : staff.entrySet()) {
            key = entry.getKey();
            if (key == id) {
                System.out.printf("Name is: %s\n", entry.getValue());
                break;
            }
        }
        if (key != id) {
            System.out.println("No ID matches!");
        }
    }

    public static void main(String[] args) throws IOException {
        Staff s = new Staff();
        s.addStaff();
        s.getByID(3);
    }
}