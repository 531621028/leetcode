package com.hkk.middle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetFolderNames {


    public String[] getFolderNames(String[] names) {
        String suffix = "(%d)";
        String[] result = new String[names.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            String temp = names[i];
            int index = 0;
            boolean isNext = false;
            while (map.containsKey(name)) {
                if (index == 0) {
                    index = map.get(name);
                } else {
                    isNext = true;
                    index = index + 1;
                }
                name = temp + String.format(suffix, index);
            }
            result[i] = name;
            if (isNext) {
                map.put(temp, index + 1);
            }
            map.put(name, 1);

        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = new String[]{
            // "kaido", "kaido(1)", "kaido", "kaido(1)"
            // "wano","wano","wano","wano"
            "onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"
            // "gta","gta(1)","gta","avalon"
            // "kaido", "kaido(1)", "kaido", "kaido(1)", "kaido(2)", "kaido(2)"
        };
        System.out.println(Arrays.toString(new GetFolderNames().getFolderNames(names)));
    }
}