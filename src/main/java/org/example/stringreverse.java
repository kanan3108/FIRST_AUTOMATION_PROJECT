package org.example;

public class stringreverse {
    public void reverse(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
        s1=s1+s.charAt(i);
        }
        System.out.println(s1);
        }
}
