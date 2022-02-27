package com.syntax.class015;

public class IndexOf {



    public static void main(String[] args) {

        String name = "How are you guys?";
        System.out.println(name.indexOf("w")); // podajemy jakis znak co jest w zdaniu, podaje nam lokalizacje, zaczynajac od 0. Jak
                                                // podamy znak ktorego nei ma to printuje -1

        System.out.println(name.indexOf("gys")); // jak damy slowo to pokazuje w ktorej lokalizacji sie zaczyna.

        System.out.println(name.indexOf("y",8+1)); // jak jest duzo tych samych liter, to uzywamy to. ignoruj pierwsze 8 liter, zcznij od 9
                                                                // ignoruje
        System.out.println(name.indexOf("y", name.indexOf("y") + 1)); // <-- to do loopy, to samo co wyzej

        System.out.println(name.indexOf("y", name.indexOf("y") + 1)); // <-- to do loopy, to samo co wyzej

    }
}
