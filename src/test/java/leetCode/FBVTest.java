package leetCode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FBVTest {
    @Before
    public void setup(){

    }


    @Test
    public void testfirstBadVersion() {
        assertEquals(4, FBV.firstBadVersion(20));

    }
}