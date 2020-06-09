package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        List list1 = new ArrayList();
        //noinspection unchecked
        list1.add("Name1");
        //noinspection unchecked
        list1.add(2);
        String name =(String) list1.get(0);
        // here the list1 does not have a specified type.

        List<String> list2 = new ArrayList<String>();
        list2.add("Name3");
        list2.add("Name4");
        list2.add("Name5");
        for(String listElement:list2){
            System.out.println(listElement);
        }
    }

}
