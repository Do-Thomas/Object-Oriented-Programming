
package Q4;

import Q3.Cape;
import java.util.List;


public class MyString implements IString {
    
    //return sum of odd digits in the string str
    public int f1(String str) {
        int sum = 0;
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length ; i++) {
            if ("13579".contains("" + a[i]))
                sum += a[i] - '0';
        }
        return sum;
    }
    
    // Return the string s, which is obtained by moving the first
    // longest word in str to its end
    //(word = a string without space(s))
    public String f2(String str) {
        String[] s = str.split("\\s");
        int max = 0;
        int pos = 0;
        for (int i = 0; i < s.length; i++) {
            if (max < s[i].length()) {
                max = s[i].length();
                pos = i;
            }
        }
        String output = "";
        for (int i = 0; i < s.length; i++) {
            if (i != pos)
                output += s[i] + " ";
        }
        output += s[pos];
        return output.trim();
    }
}
