package test.filter.common;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public class BaseTest {
    @BeforeAll
    static void setupBeforeAll(TestInfo testInfo) {
        System.out.println(String.format("\n\n[ Test Classs: %s ]", testInfo.getDisplayName()));
    }

    @BeforeEach
    void setupBeforeEach(TestInfo testInfo) {
        System.out.println(String.format("\n====== Test Name: %s ======", testInfo.getDisplayName()));
    }
}
