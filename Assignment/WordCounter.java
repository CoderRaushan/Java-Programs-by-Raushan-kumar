public class WordCounter {

    public static int countWords(String str) 
    {
        if (str == null || str.isEmpty()) 
        {
            return 0; 
        }

        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) 
    {
        String str = "This is an example string"; 
        int wordCount = countWords(str);
        System.out.println("Number of words: " + wordCount);
    }
}
