package com.bai.test;

public class StringTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        //String s = "https://www.microsoft.com/nl-NL/s-tore&/b/home?rtc=1";
       //String m = "(https|http)://www.microsoft.com/.*/s-tore&/b/home\\?rtc=1";
        //String s = "a?a";
        //String m = "a\\?a";
        String s = "DRM ID 123456789 has been saved successfully.";
        String m = "DRM ID \\d+ has been saved successfully.";
        System.out.println(s.matches(m));
        //String s = ""; //test
        //System.out.println(s.isEmpty());

    }

}
