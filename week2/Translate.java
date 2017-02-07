package week2.homework;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Translate {
    private String currentString;
    private static Map<String, String> dictionary = new HashMap<>();

    private void fillSource() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("D:/dic.txt"), "Windows-1251"));
        for (currentString = reader.readLine();
             currentString != null;
             currentString = reader.readLine()) {
            String[] keyValue = currentString.split("-");
            dictionary.put(keyValue[0], keyValue[1]);
        }
        reader.close();
    }

    private String fromEng(String word) throws IOException {
        String result = new String();
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if(entry.getKey().toLowerCase().equals(word)){
                result = entry.getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Translate t = new Translate();
        t.fillSource();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter word for translation: ");
        String word = reader.readLine();
        System.out.println(t.fromEng(word));
    }
}
