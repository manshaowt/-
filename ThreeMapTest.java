package org.container.map£»

import java.util.HashMap;
import java.util.Scanner;

public class ThreeMapTest {
    public static void main(String[] args) {
        int[] candidate = {1, 2, 3};  
        HashMap<Integer, Integer> votesMap = new HashMap();
        votesMap.put(candidate[0], 0);

        for (int i = 1; i <= 3; i++) {
            System.out.println("#" + i + ":");
            for (int j = 1; j <= 2; j++) {
                Scanner in = new Scanner(System.in);
                Integer vote = in.nextInt();

                if (votesMap.containsKey(vote)) {
                    Integer ticket = (Integer) votesMap.get(vote);
                    votesMap.put(vote, ++ticket);
                } else {
                    if (vote >= 1 && vote <= 3)
                        votesMap.put(vote, 1);
                }
            }
        }
        System.out.println("ºòÑ¡ÈË    Æ±Êý");
        votesMap.forEach((key, value) -> System.out.println(key + "    :    " + value));
    }
}


