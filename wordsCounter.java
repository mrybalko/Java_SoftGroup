package lesson8.lab4.mycounter;

import java.io.*;
import java.util.*;

//first change

public class wordsCounter {
    private String currentString;
    private String currentWord;
    private String printedString;
    private int currentValue  = 1;
    private int newValue;
    private int totalNumberOfWords;
    public Map<String, Integer> words = new HashMap<>();

    public void Counter() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Programming\\JAVA SE8 Spec\\lab4\\inFile.txt"), "Windows-1251"));

        for (currentString = reader.readLine(); currentString != null; currentString = reader.readLine()) {
            StringTokenizer tokenizer = new StringTokenizer(
                    currentString.toLowerCase().replaceAll("\\d", ""), " \t\n\r\f.,;:?!*#@$%^&()-'|<>/{}[]\"");
            while (tokenizer.hasMoreTokens()) {
                currentWord = tokenizer.nextToken();
                if (!words.containsKey(currentWord)){
                    words.put(currentWord, currentValue);
                    totalNumberOfWords++;
                }
                else {
                    Object newVal = words.get(currentWord);
                    newValue = (int) newVal;
                    newValue++;
                    words.put(currentWord, newValue);
                    totalNumberOfWords++;
                }
            }
        }
        //sorting
        words = sorting.sortByValue(words);
        reader.close();
        System.out.printf("Total number of the words: %d\n", totalNumberOfWords);
    }
    public void writeToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("D:\\Programming\\JAVA SE8 Spec\\lab4\\out.doc")));
        writer.write ("Total number of the words:  " + totalNumberOfWords);
        writer.newLine();
        writer.newLine();

        for(Map.Entry<String, Integer> entry : words.entrySet())
        {
            try {
                printedString = String.format("%1$-25s %2$s", entry.getKey(), entry.getValue());
                writer.write(printedString);
                writer.newLine();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
            }
        writer.close();
        }

    public static void main(String[] args) throws IOException {
        wordsCounter ex = new wordsCounter();
        ex.Counter();
        ex.writeToFile();
    }

}