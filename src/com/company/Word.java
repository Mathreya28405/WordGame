

package com.company;

public class Word {
    private Tile[] tiles;

    public Word (Tile[] theTiles) {
        tiles = theTiles;
    }

    public boolean hasConsecutiveDuplicates() {
        for (int i = 0; i < tiles.length-1; i++) {
            if (tiles[i].getLetter().equals(tiles[i+1].getLetter())) {
                return true;
            }
        }
        return false;
    }

    public int getTotalPoints() {
        int total = 0;
        for (int i = 0; i < tiles.length; i++) {
            total += tiles[i].getValue();
        }
        if (hasConsecutiveDuplicates()) {
            total *=2;
        }
        return total;
    }


}
