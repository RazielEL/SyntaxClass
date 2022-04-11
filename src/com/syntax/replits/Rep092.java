

public class Rep092 {
    public static void main(String[] args) {

//        Validate if the string ends with "u" prints the boolean value accordingly.
//
//                Validate if the string ends with "world" prints the boolean value accordingly.
//
//                Validate if the string ends with "are" prints the boolean value accordingly.
//
//                Validate if the string ends with "you" prints the boolean value accordingly.

        String s1="hello how are you";
        Character a = s1.charAt(s1.length()-1);
        boolean u = a.equals('u');
        System.out.println(u);
        String t2 = s1.substring(s1.lastIndexOf(" ")+1);
        boolean last = t2.equals("world");
        System.out.println(last);
        String t3 = t2;
        boolean last2 = t3.equals("are");
        System.out.println(last2);
        String t4 = t3;
        boolean last3 = t4.equals("you");
        System.out.println(last3);


    }
}
