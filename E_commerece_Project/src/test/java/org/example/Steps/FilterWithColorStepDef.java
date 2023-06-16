package org.example.Steps;

import io.cucumber.java.en.And;
import org.example.Pages.FilterWithColorPage;

public class FilterWithColorStepDef {
    FilterWithColorPage filter= new FilterWithColorPage();

    @And("user select shoes from apparel")
    public void user_select_Apparel_category_then_Shoes_subcategory() throws InterruptedException {
        Thread.sleep(1000);
        filter.Apparelthenshoes().click();
        Thread.sleep(1000);
    }

    @And("filter by Red color")
    public void filter_by_Red_color() throws InterruptedException {
        filter.filteredcolorbutn().click();
        Thread.sleep(2000);
    }
}
