/**
 * documentation ...
 */
package cw_02;

import java.util.ArrayList;
import java.util.List;


//  java -cp cw/src cw_02.HelloWorld 1 2
public class HelloWorld {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        if (args.length < 2) {
            System.out.println("Please provide at least two arguments.");
            return;
        }
        System.out.println(args[0]);
        System.out.println(args[1]);

    }
}
