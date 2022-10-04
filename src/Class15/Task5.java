package Class15;

public class Task5 {
    //Create a method createEmail(). Based on values of users name, lastName and
    // email type, your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    String createEmail(String firstname, String lastname,String emailType){
        return (firstname+lastname+"@"+emailType+".com").toLowerCase();
    }

    public static void main(String[] args) {
        Task5 task=new Task5();
        String fullEmail=task.createEmail("John","Snow","gmail");
        System.out.println(fullEmail);

        System.out.println(task.createEmail("Mansoor","Raufi","gmail"));

    }
}
