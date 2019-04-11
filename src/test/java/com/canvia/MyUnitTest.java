package com.canvia;

import org.junit.Test;
import static org.junit.Assert.*;

import com.canvia.MyUnit;
public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}