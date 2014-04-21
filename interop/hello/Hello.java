package hello;

public class Hello {
    public void hi(String caller) {
        System.out.println(caller + " calling Java");
    }
    public static void main(String[] args) {
        (new Hello()).hi("Java");
    }
}
