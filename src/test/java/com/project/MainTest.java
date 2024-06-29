package com.project;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class MainTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testApp() {

        System.out.println("Hello Baeldung Readers!!");
        Assert.assertEquals("Hello Baeldung Readers!!", systemOutRule.getLog().trim());
    }

}
