import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String input = "";
        while(in.hasNextLine())
            input += in.nextLine();
        input = input.replaceAll("\\s", "");
       // System.out.print(input);
        int lvl = 1;
        int index = 0;
        while(num > 0){
            System.out.println(input.substring(index, index+lvl));
            index+=lvl;
            lvl++;
            num--;
        }
        
    }
}
