package Practice;


public class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayofClass;

    SyntaxTechnologies(){

    }
    SyntaxTechnologies(String schoolName,int batch, int year,String lastDayofClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayofClass=lastDayofClass;
    }
    void displayMethod(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayofClass);
    }
}

