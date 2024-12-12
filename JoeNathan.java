import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String[] words;
        int bl, br, ye;
        while(in.hasNextLine()){
            
            bl = br = ye = 0;
            words = in.nextLine().split(" ");
            for(int i = 0; i < words.length; i++){
                if (words[i].equals("RED")|| words[i].equals("GREEN"))
                    br++;
                else if(words[i].equals("BLUE")||words[i].equals("PURPLE"))
                    bl++;
                else if(words[i].equals("YELLOW")|| words[i].equals("ORANGE"))
                    ye++;
            }
            if(bl > 0)
                System.out.print("BLUE: " + bl + " "); 
            if(br > 0)
                System.out.print("BROWN: " + br + " ");
            if(ye > 0)
                System.out.print("YELLOW: " + ye + " ");
            in.nextLine();
            if(in.hasNextLine())
             System.out.println("\n");
        }
    }
}
