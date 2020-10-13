package stringutils;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class StringUtilsTest {
    @RunWith(Theories.class)
    public class StringUtilsTheoriesTest {
        @DataPoints
        public String[][] VALUES = { 
            { "aaa", "aaa" },
            { "HelloWorld", "hello_world" },
            { "practiceJunit", "practice_junit" } };

        @Theory
        public void add(String[] values) throws Exception {
            String actual = StringUtils.toSnakeCase( values[0] );
            assertThat(actual, is(values[1]));
        }
    }
}
