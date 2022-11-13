package test.junit;
 
import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
 
public class SampleTest {
 
    @Tag("testing")
    @Test
    void test() {
        assertEquals(4,2+2,"test in SampleTest");
    }

    @Test
    void test1() {
        assertEquals(6,3*2,"test1 in SampleTest");
    }
 
}