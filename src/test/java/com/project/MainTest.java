package com.project;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class MainTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMain() {

        Assert.assertTrue(true);

    }

    @Test
    public void testPrint() {

        Main.print("Car");

        Assert.assertEquals("Car", systemOutRule.getLog().trim());

    }

}
