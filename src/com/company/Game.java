//14YY492U
//M.A.

package com.company;

import java.util.List;

public class Game {
    public static Word getHighestScoreWord(List<Word> words) {
        Word a = null;
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getTotalPoints() > count) {
                count = words.get(i).getTotalPoints();
                a = words.get(i);
            }
        }
        return a;
    }
}
