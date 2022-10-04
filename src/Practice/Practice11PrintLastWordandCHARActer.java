package Practice;

public class Practice11PrintLastWordandCHARActer {
    public static void main(String[] args) {
        String str="Today is sunday";
        String day=str.substring(9);
        System.out.println(day);

        //second way
        System.out.println(str.substring(6,8));

        //char method
        char c=str.charAt(4);
        System.out.println(c);
    }
}
