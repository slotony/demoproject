/**
  * The simplest java program
 */
public class HelloWorld {
    public static void main (String... s) {
	System.out.print("Hello");
        if(null == s || s.length == 0) {
            System.out.print(", world");
        } else {
            for (String a : s) {
                System.out.print(", " + a);
            }
        }
      System.out.println('!');
    }

}
