package test;

import com.codeborne.selenide.commands.FindByXpath;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class plariumTestLogin {
    @Test
    @Description("Login Test Plarium.com")
    @DisplayName("Plarium")
    void FormRunLogin() {
        step("Open plarium.com", () -> {
            open("https://plarium.com/");
        });

        step("Press LogIn", () -> {
            $("[data-qa-entity='header.login']").click();
        });

        step("Set Email 'ashestodust@yandex.ru'", () -> {
            $("[data-qa-entity='login.email.section']").setValue("ashestodust@yandex.ru");
            $("[data-qa-entity='auth.next.step']").click();
        });

        step("Enter password", () -> {
            $("[data-qa-entity='login.password.section']").setValue("1QsFt45!1");
            $("[data-qa-entity='auth.send.button']").submit();
        });
        sleep(7000);

    }

    @Test
    @Description("Select 1 Game")
    @DisplayName("Raid")
    void FormRunSelectorRaid() {
        step("Select Raid", () -> {
            $("[data-qa-payload='{\"title\":\"Raid...\"}']").click();
            sleep(5000);
          //  $("['data-qa-entity=choose.game']").click();
           // $$("#SelectGamestyled__Games-sc-1y4mhjv-7 kLYDwg").find(text("[Raid: Shadow Legends]")).click();
            // $$("#SelectGamestyled__Games-sc-1y4mhjv-7 kLYDwg").first().click();
                //    .$("[data-qa-payload]").click();
         //   $("['href=/en/game/raid-shadow-legends/']").click();

            $("#GameHeaderstyled__GameTitle-sc-1vfzxux-10 cVqVLi").shouldHave(text("Raid: Shadow Legends "));
        });
    }
/*
    @Test
    @Description("Select 2 Game")
    @DisplayName("Vikings")
    void FormRunSelectorRaid() {
        step("Select Vikings", () -> {
            $("#SelectGamestyled__Img-sc-1y4mhjv-4 dfBOCX").click();
            $("#GameHeaderstyled__GameTitle-sc-1vfzxux-10 cVqVLi").shouldHave(text("Vikings: War of Clans"));
        });
    }

    @Test
    @Description("Select 2 Game")
    @DisplayName("Vikings")
    void FormRunSelectorRaid() {
        step("Select Vikings", () -> {
            $("#SelectGamestyled__Img-sc-1y4mhjv-4 dfBOCX").click();
            $("#GameHeaderstyled__GameTitle-sc-1vfzxux-10 cVqVLi").shouldHave(text("Vikings: War of Clans"));
        });
    }
*/
    }

