package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestForm {
    @Test
    void fillFromTest() {
        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Евгения");
        $("[id=lastName]").setValue("Овечкина");
        $("[id=userEmail]").setValue("gralph@rambler.ru");




    }
}
