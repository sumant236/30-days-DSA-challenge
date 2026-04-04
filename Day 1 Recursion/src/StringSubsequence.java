import java.util.Scanner;

import static java.lang.System.in;

public class StringSubsequence {
    private static void findSubsequence(String str, String output){
        if(str.isEmpty()){
            System.out.println(output);
            return;
        }

        char ch = str.charAt(0);
        String bachaHuaInput = str.substring(1);

//        include character
        findSubsequence(bachaHuaInput, output + ch);
//        Don't include character
        findSubsequence(bachaHuaInput, output);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String str = sc.nextLine();
        findSubsequence(str, "");

    }
}
