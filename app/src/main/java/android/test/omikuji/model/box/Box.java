package android.test.omikuji.model.box;

import java.util.Random;

/**
 * Created by Kohei on 1/2/18.
 */

public class Box {
    /**
     * constructor
     */
    public Box (){

    }

    public enum Luck {
        DAIKICHI("大吉"),
        KICHI("吉"),
        CHUKICHI("中吉"),
        SYOKICHI("小吉"),
        SUEKICHI("末吉"),
        KYO("凶");

        private final String val;
        private Luck(final String val){
            this.val = val;
        }
        public String getVal () {
            return this.val;
        }
    };

    public static String pick () {
        return Luck.values()[new Random().nextInt(Luck.values().length)].getVal();
    }
}
