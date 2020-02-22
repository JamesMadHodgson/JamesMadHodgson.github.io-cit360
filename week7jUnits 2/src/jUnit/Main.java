package jUnit;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.*;

public class Main {

    public static void main(String[] args) {

        String var1 = "test";
        String var2 = var1;
        String var3 = new String("test");
        /**
        * Equals
         **/
        checkEquals("Junit", "Junit");
        //isSame(var1, var3); // Broken
        /**
         * is same
         */
        isSame(var1, var1);

        /**
         * Array equals
         */
        String[] testA = {"red", "yellow", "blue", "green"};
        String[] testB = {"red", "yellow", "blue", "green"};
        array(testA, testB);

        /**
         * True and False
         */
        int testa = 10;
        int testb = 20;
        True(testa, testb);
        False(testa, testb);

        /**
         * notNull
         */
        NotNull("");

        /**
         * null
         */
        String nullString = null;
        Null(nullString);

        /**
         * NotSame
         */
        int a = 20;
        int b = 21;
        NotSame(a,b);

        /**
         * That
         */
        That();

    }


    static void checkEquals(String a, String b){

        assertEquals(a,b);
        System.out.println("Strings are equal!" );

    }

    static void isSame(String a, String b){

        assertSame(a,b);
        System.out.println("Strings are the same!" );

    }
    static void array(String[] testA, String[] testB){
        assertArrayEquals(testA, testB);
        System.out.println("Arrays strings are the same!" );

    }

   private static void True(int first_number, int second_number){
        assertTrue( first_number < second_number);
        System.out.println("boolean is true!");

    }

    static void False(int first_number, int second_number){

        assertFalse( first_number  > second_number);
        System.out.println("boolean is False!");
    }
    static void NotNull(String object){
        //int whatever = Integer.parseInt(null);
        assertNotNull(object);
        System.out.println("notNull!");
    }
   static void Null(String object){
        assertNull(object);
       System.out.println("Null!");
    }
    static void NotSame(int a, int b){
        assertNotSame(a,b);
        System.out.println("notSame");
    }
    static void That(){
        assertThat("String", isA(String.class));
        System.out.println("It is a string!");

    }


}
