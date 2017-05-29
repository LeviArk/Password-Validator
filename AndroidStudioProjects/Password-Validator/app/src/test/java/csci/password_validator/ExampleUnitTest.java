package csci.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void password_isCorrect() throws Exception
    {
        MainActivity tester = new MainActivity();
        String password1 = "password";
        String password2 = "zero";
        String password3 = "Fishsticks2";
        String password4 = "testthemall";
        String password5 = "TESTTHEMALL";
        String password6 = "abcdefg1";
        String password7 = "abcdefGH";
        assertEquals(1,tester.PasswordVerify(password1));
        assertEquals(1,tester.PasswordVerify(password2));
        assertEquals(5, tester.PasswordVerify(password3));
        assertEquals(3, tester.PasswordVerify(password4));
        assertEquals(3, tester.PasswordVerify(password5));
        assertEquals(4, tester.PasswordVerify(password6));
        assertEquals(4, tester.PasswordVerify(password7));


    }
}