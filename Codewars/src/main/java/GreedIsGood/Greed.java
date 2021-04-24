package GreedIsGood;

import java.util.HashMap;

public class Greed {
    public static int greedy(int[] dice){

        HashMap<Integer, Integer> scores = new HashMap<>();
        int result = 0;
        //put throws and its values in map
        for (int i = 0; i < 5; i++) {
            int d = dice[i];
            if (!scores.containsKey(d)) {
                scores.put(d, 1);
            }
            else {
                int val = scores.get(d) + 1;
                scores.put(d, val);
            }
        }

        //sum points due to rules
        for (Integer t : scores.keySet()) {
            int val = scores.get(t);
            //value 3 or more
            if (val >= 3) {
                switch(t) {
                    case 1 : result += 1000; break;
                    case 6 : result += 600; break;
                    case 5 : result += 500; break;
                    case 4 : result += 400; break;
                    case 3 : result += 300; break;
                    case 2 : result += 200; break;
                }
                //if larger than 3 sum the rest
                if (val % 3 == 1 && t == 1) {
                    result += 100;
                }
                if (val % 3 == 2 && t == 1) {
                    result += 200;
                }
                if (val % 3 == 1 && t == 5) {
                    result += 50;
                }
                if (val % 3 == 2 && t == 5) {
                    result += 100;
                }
            }
            //sum points for one 1 or one 5
            if (t == 1 && val == 1) {
                result += 100;
            }
            if (t == 1 && val == 2) {
                result += 200;
            }
            if (t == 5 && val == 1) {
                result += 50;
            }
            if (t == 5 && val == 2) {
                result += 100;
            }
        }
        return result;
    }
}
