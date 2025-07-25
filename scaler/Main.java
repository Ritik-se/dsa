public import java.lang.*;

import java.util.*;

public class Main {

    public static void recursion(String s, int i) {
        if (i < 0) {
            return;
        }
        System.out.print(s.charAt(i));

        recursion(s, i - 1);

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();

        recursion(str, str.length() - 1);

    }
}
{
    
}
