package oops.StringClass;

public class stringclass {
    public static void main(String[] args) {
        String a = "Abcdefg jklhdhf";
        String []d = a.split("\\s");

        String D = "DEFRH";
        String e = "E";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(D.equals(e));
        System.out.println(D.equalsIgnoreCase(e));
        System.out.println(D.compareTo(e));
        System.out.println(D.length());
        System.out.println(d.length);
    }
}
