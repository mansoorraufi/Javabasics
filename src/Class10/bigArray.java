package Class10;

import java.awt.Container;

public class bigArray {
	public static void main(String[] args) {
		
		String[][] countries= {
                {"Usa", "Canada"}, //1 array with index 0
                {"Peru", "Brazil", "Colombia", "Ecuador"}, //2 array with index 1
                {"Ethiopia", "Egypt", "Kenya"},
                {"Germany", "Turkiye", "Moldova", "Ukraine"},
                {"Kazakhstan", "Afghanistan", "Korea"}
        };
		System.out.println(countries.length);
		int elof1arr=countries[0].length;
		System.out.println(elof1arr);
		
	}

}
