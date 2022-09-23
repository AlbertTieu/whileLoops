
/**
 * Write a description of class whileLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whileLoops
{
    public static void main(String[]args) {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " and it's less than 15");
            i = i + 1;
        }
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + i + " and it's more than 5");
            k = k - 1;
        }
        int a = 0;
        int b = 0;
        while (a < 10 && b <= 20) {
            System.out.println("a is " + a + " and it's less than 10");
            System.out.println("b is " + b + " and it's less than or equal to 20");
            a = a + 1;
            b = b + 1;
        }
    }
}
