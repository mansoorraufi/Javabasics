package Class14_Methods;

public class Task3 {
    public static void main(String[] args) {
        //you have a String a="Is it saturday? Is it raining? Do we have a Java Class today?"
        //how would you find out how many sentences are in that String?

        String a="Is it saturday? Is it raining? Do we have a Java Class today?";

        String[] sentences = a.split("[,?]");// can put (? . ; / ,) all signs that ends the sentence and function counts the sentences

        System.out.println(sentences.length);



    }
}
