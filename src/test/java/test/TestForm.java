package test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


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
        //$("[for='gender-radio-2']").click();
        $(byText("Female")).click();
        //заполняем текстовое поле телефон
        $("#userNumber").setValue("9296556480");
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
        //$("[for='hobbies-checkbox-2']").click();
        //загрузка файла текстовый файл в идеа
        ///прописываем путь к файлу
        //File file = new File("src/test/down.load");
        ///селектор на загрузку файла по указанному ранее пути
        $("#uploadPicture").uploadFile(new File("src/test/down.load"));
        //заполняем текстовое поле адрес
        $("#currentAddress").setValue("Moscow");
        //выбор из выпадающего списка с указанием значения клик на выбранное значение
        $("#react-select-3-input").setValue("Haryana").pressEnter();
        $("#react-select-4-input").setValue("Karnal").pressEnter();
        //клик по итоговой кнопке
        $("#submit").click();

        //проверка формы
        // checkResult();
        $(".modal-content").shouldHave(
                text("Student Name"), text("Evgenia Ovechkina"),
                text("Student Email"), text("gralph@rambler.ru"),
                text("Gender"), text("Female"),
                text("Mobile"), text("9296556480"),
                text("Date of Birth"), text("06 June,1986"),
                text("Subjects"), text("Economics"),
                text("Hobbies"), text("Sports"),
                text("Picture"), text("down.load"),
                text("Address"), text("Moscow"),
                text("State and City"), text("Haryana Karnal")
        );
        sleep(5000);

    }
}


    /*void checkResult() {
       $(byText("Thanks for submitting the form")).should(appear);
       $(byText("Evgenia Ovechkina")).should(appear);
       $(byText("gralph@rambler.ru")).should(appear);
       $(byText("Female")).should(appear);
       $(byText("9296556480")).should(appear);
       $(byText("")).should(appear);
       $(byText("Economics")).should(appear);
       $(byText("Reading, Sports")).should(appear);
       $(byText("down.load")).should(appear);
       $(byText("Moscow")).should(appear);
       $(byText("Haryana")).should(appear);
       $(byText("Karnal")).should(appear);
    }


     */

    /*$(".modal-content").shouldHave(
            text("Student Name"), text("Evgenia Ovechkina"),
    text("Student Email"), text("gralph@rambler.ru"),
    text("Gender"), text("Female"),
    text("Student Name"), text("9296556480"),
    text("Student Name"), text("06 June,1986"),
    text("Student Name"), text("Evgenia Ovechkina"),
    text("Student Name"), text("Evgenia Ovechkina"),
    text("Student Name"), text("Evgenia Ovechkina"),
    text("Student Name"), text("Evgenia Ovechkina"),
    text("Student Name"), text("Evgenia Ovechkina"),
    );
        }

     */


