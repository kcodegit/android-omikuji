package android.test.omikuji;

/**
 * Created by ando on 2017/12/08.
 */


public class Business {
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

    static String pick() {
        return Luck.DAIKICHI.getVal();
    };


}
