package generics;


// here the program is for converting any type of array to it's list using a single function.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericMethodExample {

    public static Integer[] intArray = {1,2,3,4};
    public static Character[] charArray = {'a','b','c','d'};
    public static String[] stringArray = {"string1","string2","string3","string4"};
// this is one way
//    List convertToList(Object[] array){
//        ArrayList objectList = new ArrayList();
//        Collections.addAll(objectList, array);
//        return objectList;
//    }
    // the first <T> before the return type is for the variables declared which will be used in the scope.

    public static <T> List<T> convertToList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
     }


    public static void main(String[] args) {

//        List<Integer> integerList = gme.convertToList(gme.intArray);
        //now this charList will not throw a compile time error even if it is assigned as Integer.
        //List<Character> charList = gme.convertToList(gme.charArray);

        List<Integer> intList = convertToList(intArray);
        for(Integer i:intList){
            System.out.println(i);
        }

    }
}
