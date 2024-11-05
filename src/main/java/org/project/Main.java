package org.project;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        List<Integer> linkedList = new LinkedList<>();//generic .. 1 2 3 4 ..
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        List<Integer> arrayList = new ArrayList<>();//generic int[1,2,3,4,5,6,7]



        Map<String, String> map = new HashMap<>();
        map.put("a", "Igor");
        map.put("a", "Igor - abcd");
//        String s = map.get("a");
//        System.out.println(s);
//        System.out.println(map);
    }


    //1 - Igor
    //2 - Ivan
    //3 - Ivan2
    //4 - Ivan3

}