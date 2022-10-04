package Class15;

public class Task1 {
//Create a method that will take 2 parameters as a numbers and prints which
 //number is larger.

        void printLarger (int num1,int num2){
            if (num1>num2){
                System.out.println("Number 1 is larger "+num1);
            } else
                if (num2>num1){
                    System.out.println("Number 2 is larger "+num2);
                }
        }
        //calling the method as bellow:
        public static void main(String[] args){

        Task1 task1=new Task1();
        task1.printLarger(12,36);
        task1.printLarger(50,12);


    }
}
