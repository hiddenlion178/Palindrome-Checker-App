import java.util.Scanner;

public class Main {
    public static void printXInAFrame(int size, int repeat) {
        for (int i = 0; i < size; i++) {
            for (int r = 0; r < repeat; r++) {

                if (i == 0 || i == size - 1) {
                    System.out.print("*");
                    for (int j = 0; j < size - 2; j++) System.out.print("-");
                    System.out.print("*");
                } else {
                    System.out.print("|");
                    for (int j = 1; j < size - 1; j++) {
                        if (j == i || j == size - 1 - i) System.out.print("*");
                        else System.out.print(" ");
                    }
                    System.out.print("|");
                }

                if (r < repeat - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
