/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class MyString implements IString {
    
    @Override
    //Count and return number of words containing at least 1 odd digit.
    public int f1(String str) {
        int count = 0;
        String[] s = str.split("\\s");
        for (int i = 0; i < s.length; i++) {
            char[] a = s[i].toCharArray();
            
            for (int j = 0; j < 10; j++) {
                if ("13579".contains("" + a[i])) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    
    @Override
    //Return the string s, which is obtained replacing the(first) palidrom word 
    //in str with the string "XX"(word = a string without(s), a word is called palidrom
    //if it and its reverse are the same.
    public String f2(String str) {
        int pos = -1;
        String[] s = str.split("\\s");
        for (int i = 0; i < s.length; i++) {
            if (check(s[i])) {
                pos = i;
                break;
            }
        }
        s[pos] = "XX";
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
