package sentimentReport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public final class BookAnalyzer {

    public Set<String> posWords;
    public Set<String> negWords;
    public ArrayList<String> bookWords;

    private final ArrayList<String> posWordList;
    private final ArrayList<String> negWordList;

    private String mostCommonKey;
    private Integer maxValue;

//default word list if on testing mode
    public static final String[] POSLIST = {"good", "nice", "love", "excellent", "great",
        "awesome", "wonderful", "fantastic", "fabulous", "like"};
    public static final String[] NEGLIST = {"bad", "aweful", "hate", "terrible", "miserable", "sad",
        "dislike", "atrocious", "depressed", "cry"};

    //constructor for the class
    public BookAnalyzer(File positive, File negative, File book) throws FileNotFoundException {

        this.posWords = new HashSet<>();
        this.negWords = new HashSet<>();
        this.bookWords = new ArrayList<>();

        //initiate the positive word txt file into a hashSet of positive words
        //ignoring punctuation and digits
        if (!positive.exists()) {
            System.out.println("You've entered an invalid Positive words list, use default list");
            posWords.addAll(Arrays.asList(POSLIST));
        } else {

            Scanner pos = new Scanner(positive);
            while (pos.hasNextLine()) {
                String s = pos.next();
                posWords.add(s);
            }
        }

        //initiate the negative word txt file into a hashSet of negative words
        //ignoring punctuation and digits
        if (!negative.exists()) {
            System.out.println("You've entered an invalid Negative words list, use default list");
            negWords.addAll(Arrays.asList(NEGLIST));
        } else {
            Scanner neg = new Scanner(negative);
            while (neg.hasNextLine()) {
                String s = neg.next();
                negWords.add(s);
            }
        }

        //initiate the book txt file into an ArrayList of words
        //ignoring punctuation and digits
        Scanner s = new Scanner(book);
        s.useDelimiter("\\Z"); //ignore empty line//ignore empty line
        while (s.hasNextLine()) {
            String str = s.next().replaceAll("\\p{Punct}|\\d", ""); //ignoring all punctuation and special characters
            String[] words = str.split("\\s+"); //broken down the string into seperate words
            bookWords.addAll(Arrays.asList(words));
        }
        posWordList = new ArrayList<>();
        negWordList = new ArrayList<>();
        for (int i = 0; i < bookWords.size(); i++) {
            for (String str : posWords) {
                if (str.equalsIgnoreCase(bookWords.get(i))) {
                    posWordList.add(str);
                }
            }

            for (String str : negWords) {
                {
                    if (str.equalsIgnoreCase(bookWords.get(i))) {
                        negWordList.add(str);
                    }
                }
            }
        }
    }

    //creates the positive and negative words set for a given book. 
    public String sentimentAnalyzed() {

        String sentiment = "";
        //testing for sentiment of the book
        if (getPosWords() > getNegWords()) {
            sentiment = "Comedy";
        } else if (getPosWords() < getNegWords()) {
            sentiment = "Tragedy";
        } else {
            sentiment = "Boring";
        }
        return sentiment;
    }

    //return total number of words in the book
    public int getTotalWordsBook() {
        return bookWords.size();
    }

    //return total number of positive words in the book
    public int getPosWords() {
        return posWordList.size();
    }

    //return total number of negative words in the book
    public int getNegWords() {
        return negWordList.size();
    }

    //return the percentage of words that are positive
    public double getPosPer() {
    	//return (getPosWords() / getTotalWordsBook()) * 100;
        return ((float)getPosWords() / getTotalWordsBook()) * 100;
    }

    //return the percentage of words that are negative
    public double getNegPer() {
    	//return (getNegWords() / getTotalWordsBook()) * 100;
        return ((float)getNegWords() / getTotalWordsBook()) * 100;
    }

    public ArrayList<String> getPosList() {
        return posWordList;
    }

    public ArrayList<String> getNegList() {
        return negWordList;
    }
    
    public String mostPositiveWord(){
        mostCommonElement(posWordList);
        return mostCommonKey;
    }
    
    public int mostPositiveNum(){
        mostCommonElement(posWordList);
        return maxValue;
    }
    
    public String mostNegativeWord(){
        mostCommonElement(negWordList);
        return mostCommonKey;
        
    }
    public int mostNegativeNum(){
        mostCommonElement(negWordList);
        return maxValue;
    }
    
 private void mostCommonElement(ArrayList<String> list) {
     
    Map<String, Integer> map = new HashMap<>();
     
    for(int i=0; i< list.size(); i++) {
         
        Integer frequency = map.get(list.get(i));
        if(frequency == null) {
            map.put(list.get(i), 1);
        } else {
            map.put(list.get(i), frequency+1);
        }
    }
     
    mostCommonKey = null;
        maxValue = -1;
    for(Map.Entry<String, Integer> entry: map.entrySet()) {
         
        if(entry.getValue() > maxValue) {
            mostCommonKey = entry.getKey();
            maxValue = entry.getValue();
        }
    }
}
}
