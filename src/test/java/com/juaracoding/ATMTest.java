package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/12/2024 2:39 AM
@Last Modified 10/12/2024 2:39 AM
Version 1.0
*/

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {
    ATM atm;

    @BeforeMethod
    public void setUp() {
        atm = new ATM(1000);
    }

    @Test
    public void testLihatSaldo() {
       double actual = atm.lihatSaldo();
       double expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSetorUang() {
        atm.setorUang(5000);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegative() {
        atm.setorUang(-1);
    }

    @Test
    public void testTarikUang(){
        atm.tarikUang(200);
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo(){
        atm.tarikUang(2000);
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegative(){
        atm.tarikUang(-1);
    }
}
