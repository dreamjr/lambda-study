package test.filter;

import main.filter.FilterOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.filter.common.BaseTest;

import static org.junit.jupiter.api.Assertions.fail;


public class FilterJunitTest extends BaseTest {

    private FilterOperation filterOperation;

    @BeforeEach
    void setup() {
        filterOperation = new FilterOperation();
    }

    @Test
    public void printFilteredNamesTest() {
        filterOperation.printFilteredNames();
    }

    @Test
    public void printFilteredNamesTest2() {
        filterOperation.printFilteredNameList();
    }

    @Test
    public void fialedTest3() {
        fail("FailTest");
    }
}
