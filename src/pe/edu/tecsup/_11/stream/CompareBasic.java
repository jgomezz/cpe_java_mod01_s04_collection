package pe.edu.tecsup._11.stream;

public class CompareBasic {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int cmp = Integer.compare(a,b);

        System.out.println(Integer.compare(5,7));
        System.out.println(Integer.compare(5,5));
        System.out.println(Integer.compare(7,5));

    }
}
