package week2.homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

public class Song {
    private static Comparator<Song> bySingerName = new SortBySingerName();
    private static Comparator<Song> bySongName = new SortBySongName();
    private static Comparator<Song> byRating = new SortByRating();

    private static TreeSet<Song> songs = new TreeSet<>(bySingerName);// choose sorting method
    private String singerName;
    private String songName;
    private double rating;

    public String getSingerName() {
        return singerName;
    }
    public void setSingerName(String name) {
        this.singerName = name;
    }
    public String getSongName(){return songName;}
    public void setSongName(String name) {this.songName = name;}
    public double getRating() {return rating;}
    public void setRating(double rating) {this.rating = rating;}

    public Song(String singerName, String songName, double rating) {
        this.singerName = singerName;
        this.songName = songName;
        this.rating = rating;
    }

    private void fillCollection() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("D:/singers.txt"), "Windows-1251"));
        String currentString;
        for (currentString = reader.readLine();
             currentString != null;
             currentString = reader.readLine()) {
            String[] tokens = currentString.split("/");
            double rate = Double.parseDouble(tokens[2]);
            setSingerName(tokens[0]);
            setSongName(tokens[1]);
            setRating(rate);
            songs.add(new Song(getSingerName(), getSongName(), getRating()));
        }
    }

    private static class SortBySingerName implements Comparator<Song> {
        @Override
        public int compare(Song singer1, Song singer2) {
            return singer1.getSingerName().compareTo(singer2.getSingerName());
        }
    }

    private static class SortBySongName implements Comparator<Song> {

        @Override
        public int compare(Song song1, Song song2) {
            return song1.getSongName().compareTo(song2.getSongName());
        }
    }

    private static class SortByRating implements Comparator<Song> {
        @Override
        public int compare(Song rating1, Song rating2) {
            double r1 = rating1.getRating();
            double r2 = rating2.getRating();
            if (r1 < r2){
                return 1;
            }else if(r1 > r2){
                return -1;
            }else{
                return 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Song song = new Song(null, null, 0.0);
        song.fillCollection();
        for(Song s : songs) {
            System.out.printf("%1$-25s %2$-30s %3$s\n", s.getSingerName(), s.getSongName(), s.getRating());
        }
        }
    }

