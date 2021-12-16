package test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestForm {
    @Test
    void fillFromTest() {
       //открываем страницу с формой в браузере
        open("https://demoqa.com/automation-practice-form");
        //заполняем текстовое поле имя
        $("#firstName").setValue("Evgenia");
        //заполняем текстовое поле фамилия
        $("#lastName").setValue("Ovechkina");
        //заполняем текстовое поле эл.адреса
        $("#userEmail").setValue("gralph@rambler.ru");
        //кликаем на радоио-батн
        $("[for='gender-radio-2']").click();
        //заполняем текстовое поле телефон
        $("#userNumber").setValue("1234567");
        //кликаем на поле дата чтобы всплыл календарь
        $("#dateOfBirthInput").click();
        //выбор года из календаря
        $(".react-datepicker__year-select").selectOptionByValue("1986");
        //выбор месяца из календаря
        $(".react-datepicker__month-select").selectOptionByValue("5");
        //выбор даты из календаря. клик на дату
        $(".react-datepicker__day--006").click();
        //заполнение поля сабджект тегом. выбор значения. клик для ввода значения
        $("#subjectsInput").setValue("Economics").pressEnter();
        //выбор чек-бокса
        $("[for='hobbies-checkbox-1']").click();
        $("[for='hobbies-checkbox-2']").click();



    }
}
