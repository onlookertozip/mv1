package com.sds;

import static org.junit.Assert.*;

public class CalTest {
    Cal c=new Cal();
    int a=10;
    int b=20;

    @org.junit.Test
    public void cal() {
        assertEquals(30, c.cal(a,b));
    }
}
