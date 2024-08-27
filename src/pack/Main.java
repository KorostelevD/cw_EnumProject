package pack;

import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number = SimpleColors.BLUE.number();
        System.out.println(number);
        System.out.println(SimpleColors.BLUE.blue());
        System.out.println(SimpleColors.BLUE);
        System.out.println(SimpleColors.BLUE.name());
        System.out.println(SimpleColors.BLUE);
        System.out.println(SimpleColors.RED);
        SimpleColors.RED.out();
        SimpleColors.BLUE.out();
        //

        System.out.println(Colors.RED);
        System.out.println("Hello RED");
        System.out.println(Colors.GREEN + "Hello Green");
        Colors.DEFAULT.out("");
        System.out.println("Defautt");
        Colors.RED.out(123).GREEN.out(123);
        System.out.println(Colors.RED + "Hello");
        Colors.RED.out("dddd");

    }
}