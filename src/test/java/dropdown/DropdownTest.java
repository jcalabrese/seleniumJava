package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest {
    @Test
    public void testSelectedOoption(){
        var dropdownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1, "Incorrect number of selection");
        assertTrue(selectedOptions.contains(option),"Option not selected");

}

    @Test
    public void testConvertToSelectMultiple(){
        var dropdownPage = homePage.clickDropdown();
        List<String> options = List.of("Option 1","Option 2");
        dropdownPage.changeToMultiselect();

        dropdownPage.selectFromDropdown(options.get(0));
        dropdownPage.selectFromDropdown(options.get(1));
        var selectedOptions = dropdownPage.getSelectedOptions();
//         List<String> options = Arrays.asList("Option 1","Option 2");



        assertEquals(selectedOptions.size(),2,"Incorrect number of selection");
        assertTrue(selectedOptions.containsAll(options),"Options not selected");
    }
}

