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
        String password3 = "fishsticks2";
        assertEquals(tester.PasswordVerify(password1),1);
        assertEquals(tester.PasswordVerify(password2),1);
        assertEquals(tester.PasswordVerify(password3),2);

    }
}