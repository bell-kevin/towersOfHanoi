//this uses a recursive algorithm for Towers of Hanoi problem
package towers;

public class Towers {

    public static void main(String[] args) {
        // TODO code application logic here
        move(4, 'A', 'C', 'B');
    }

    // Move n disks from source s to destination d using temporary t.
    private static void move(int n, char s, char d, char t) {
        //System.out.printf("call n=%d, s=%s, d=%s, t=%s\n", n, s, d, t);
        if (n == 1) {
            System.out.printf("move %d from %s to %s\n", n, s, d);
        } else {
            move(n - 1, s, t, d);//source to temporary
            System.out.printf("move %d from %s to %s\n", n, s, d);
            move(n - 1, t, d, s);//temporary destination
        }
        // System.out.println("return n=" + n);
    }
}//end class towers