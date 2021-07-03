package com.company;

import org.junit.Test;
import static org.junit.Assert.*;


public class MyUnitTest {
    @Test
    public void testConcat() {
        MyUnit unit = new MyUnit();
        String result = unit.concat("one", "two");
        assertEquals(result, "onetwo");
    }
}
