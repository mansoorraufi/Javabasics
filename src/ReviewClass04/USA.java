package ReviewClass04;

import ReviewClass03.Country;

public class USA extends Country {

    USA(String name){
        super(name);
    }

    public static void main(String[] args) {

        USA usa=new USA("USA");
        usa.name="USA"; //public
        usa.capital="DC"; //protected
    }
}
