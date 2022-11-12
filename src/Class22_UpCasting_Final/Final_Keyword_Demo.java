package Class22_UpCasting_Final;

public class Final_Keyword_Demo {
    public static void main(String[] args) {
        Phone phone=new Phone();
        //   phone.RAM=50;

    }
}

class  Phone{
    final int RAM=12;

    void takePics(){
        final int number=10;

    }
}

final class Iphone extends Phone{

    void takePics(){

    }
}
