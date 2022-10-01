package Class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("Today is java class");
        StringBuffer stringBuffer=new StringBuffer("Today is java class");

        String str="Java is very easy";
        // converting String to StringBuilder
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);

        // converting stringBuilder to String.
        String newstr=stringBuilder1.toString();

    }
}
