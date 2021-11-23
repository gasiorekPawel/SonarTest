package basic;

import java.util.List;

public class TestClass {
    public static List simpleList = List.of("aa", "bb", "ccc");

    public static void main(String[] args) {
        String textExample = "aaaa";

        int unusedVariable = 111;
        methodOne("aa");
        methodTwo("aa");
        System.out.println(textExample);
    }

    static void methodOne(String value) {
        System.out.println(value);
    }

    static void methodTwo(String text) {
        System.out.println(text);
    }

//    boolean getNumberOfElementsInsideList(List list, String element) {
//        return simpleList.stream().filter($ -> $.equals(element));
//    }
}