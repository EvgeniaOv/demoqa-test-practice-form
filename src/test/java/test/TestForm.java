package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestForm {
    @Test
    void fillFromTest() {
       //открываем страницу с формой в браузере
        open("https://demoqa.com/automation-practice-form");
        //заполняем текстовое поле Имя
        $("[id=firstName]").setValue("Евгения");
        //заполняем текстовое поле фамилия
        $("[id=lastName]").setValue("Овечкина");
        //заполняем текстовое поле эл.адреса
        $("[id=userEmail]").setValue("gralph@rambler.ru");
        //кликаем на радоио-батн
        $("[for='gender-radio-2']").click();
        //заполняем текстовое поле телефон
        $("[id=userNumber]").setValue("1234567");





    }
}
