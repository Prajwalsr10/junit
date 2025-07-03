/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ust.Account;

/**
 *
 * @author Administrator
 */
public class TestAccount {
@Rule
public ExpectedException thrown = ExpectedException.none();

static Account account;

@Before
public void init(){
    account = new Account();
}

@After
public void clean(){
    account = null;
    System.out.println("clean up");
}
    @Test
    public void testAccount1() {
        Account account = new Account();
        boolean result = account.withdraw(200);
        org.junit.Assert.assertEquals(true, result);
    }
    @Test
    public void testThrowsException(){
        ExpectedException thrown = ExpectedException.none();
        thrown.expect(IllegalArgumentException.class);
        Account account = new Account();
        account.withdraw(200);
    }
}
