package ru.stqa.ptf.sandbox;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion() {

        goToGroupPage();
        selectGroup();
        deleteGroup();
        goToGroupPage();
        logOut();
    }


}

