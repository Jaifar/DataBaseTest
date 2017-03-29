package ru.stqa.ptf.sandbox;

import org.testng.annotations.Test;

public class ContactDeletingTest extends TestBase {


    @Test
    public void testContactDeleting() {

        selectContact();
        deletingContact();
        goHomePage();
    }

}
