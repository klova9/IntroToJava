// Work in progress

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MagicSquares {
    public static void main(String args[]) throws IOException {
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader("MagicSquares\\Luna.txt")))){
        String[] strArray = (sc.nextLine().split("\t"));
        for(int i = 0; i<strArray.length; i++){
            System.out.println(Integer.valueOf(strArray[i]));
        }
        }
    }
}