package day01.practice;

public class AccessModifier {
    public String a = "a";
    public String b = "b";
    public String c = "c";
    public static String d = "d";

    public static void main(String[] args) {
        AccessModifier instance = new AccessModifier();
        System.out.println(instance.a);
        System.out.println(instance.b);
        System.out.println(instance.c);
        System.out.println(d);
    }
}

