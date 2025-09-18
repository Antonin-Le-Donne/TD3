package com.iutblagnac.r303trace;


public class App {

    public static void main(String[] args) {
        System.out.println(hello());
    }

    /**
     * dis "Hello World!"
     * @return "Hello World!" si pas de paramètre
     */
    public static String hello() {
        return "Hello World!";
    }

    /**
     * dis bonjour avec un paramètre
     * @param param le paramètre
     * @return le paramètre
     */
    public static String hello(String param) {
        return param;
    }

}
