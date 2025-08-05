import java.util.Scanner;

public class ScIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a;
        Float b;
        Character c;
        Character d;
        //a = sc.nextInt();
        a = Integer.parseInt(sc.nextLine());
        c = sc.nextLine().charAt(0);
        //b = sc.nextFloat();
        b = Float.parseFloat(sc.nextLine());
        d = sc.nextLine().charAt(0);
        System.out.println(a+ " " +b+ " " +c+ " " +d);
        sc.close();
    }
}