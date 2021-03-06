package codingbat.java.warmup1;

/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is below 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */

public class Diff21 {

    public static void main(String[] args) {
        diff21(19);
        diff21(10);
    }

    public static int diff21(int n) {
        if(n <= 21) {
            return 21 - n;
        } else {
            return 2 * (n -21);
        }
    }
}

