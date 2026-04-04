import java.util.Scanner;

import static java.lang.System.in;

public class StringSubarray {
    private static void findSubarray(String str, String output){
        if(str.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = str.charAt(0);
        findSubarray(str.substring(1), output+ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String str = sc.nextLine();
        findSubarray(str, "");
    }
}
