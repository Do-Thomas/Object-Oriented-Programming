
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MyString implements IString{

    @Override
      //Count and return number of words containing at least 1 even digit.
    public int f1(String str) {
        int digit=0;
  for (int i = 0; i < str.length(); i++) {
      
              
            char ch = str.charAt(i);
  if (ch >= '0' && ch <= '9' && ch%2==0)
                digit++;
        }
        return digit;
        
      

    }

    

    @Override
    //Return the string s, which is obtained by replacing the (first) palindrom word in str with the string "YY" (word = a string without space(s), a word is called palindrom if it and its reverse are
    public String f2(String str) {
        int pos = -1;
        String[] s = str.split("\\s");
        for (int i = 0; i < s.length; i++) {
            if (check(s[i])) {
                pos = i;
                break;
            }
        }
        s[pos] = "YY";
        String output = "";
        for (int i = 0; i < s.length; i++) {
            output += s[i] + " ";
        }
        return output.trim();
    }
    public boolean check(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        if (stringBuffer.reverse().toString().equals(s))
            return true;
        return false;
    }
    }
//public String f2(String str) {
//        int pos = -1;
//        String[] s = str.split("\\s");
//        for (int i = 0; i < s.length; i++) {
//            if (check(s[i])) {
//                pos = i;
//                break;
//            }
//        }
//        s[pos] = "XX";
//        String output = "";
//        for (int i = 0; i < s.length; i++) {
//            output += s[i] + " ";
//        }
//        return output.trim();
//    }
//    public boolean check(String s) {
//        StringBuffer stringBuffer = new StringBuffer(s);
//        if (stringBuffer.reverse().toString().equals(s))
//            return true;
//        return false;
//    }

