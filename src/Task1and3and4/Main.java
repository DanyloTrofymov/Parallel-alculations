package Task1and3and4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        File directory = new File("out/test");
        System.out.println(directory.getAbsolutePath());
        List<String> keywords = new ArrayList<>(Arrays.asList(
                "programming", "software", "hardware", "networking", "database", "encryption", "cybersecurity",
                "artificial", "intelligence", "virtual", "blockchain", "interface"));
        long startTime = System.currentTimeMillis();
        FileAnalyser task = new FileAnalyser(directory, keywords);
        pool.invoke(task);
        long endTime = System.currentTimeMillis();

        System.out.println("Time: " + (endTime - startTime) + " ms");
        System.out.println("Total words length sum: " + task.getWordLengthSum());
        System.out.println("Total words count: " + task.getWordCount());
        System.out.println("Average word length is: " + task.getAverageWordLength());
        System.out.println("Standard deviation is: " + task.getStandardDeviation());
        System.out.println("Dispersion is: " + task.getDispersion());
        System.out.println("Word length are: " + task.getWordLengths());
        System.out.println("Common words are: " + task.getCommonWords());
        System.out.println("Documents with keywords are: " + task.getDocumentsWithKeywords());
        System.out.println("Documents with keywords count: " + task.getDocumentsWithKeywords().size());
    }
}