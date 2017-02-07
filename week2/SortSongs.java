package week2.homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSongs {

    private String currentString;
    private static List <String> songs = new ArrayList();

    public void fill() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("D:/songs.txt"), "Windows-1251"));
        for (currentString = reader.readLine();
             currentString != null;
             currentString = reader.readLine()) {
                songs.add(currentString);
            }
        reader.close();
        }

    public static void main(String[] args) throws IOException {
        SortSongs sort = new SortSongs();
        sort.fill();
        Collections.sort(songs);
        for (String s : songs){
            System.out.println(s);
        }
    }
}
