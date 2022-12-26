package ru.netology.Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class StartPage {
    private final SelenideElement headingStart = $("h2.heading");
    private final SelenideElement paymentButton = $$(".button").find(exactText("Купить"));
    private final SelenideElement creditButton = $$(".button").find(exactText("Купить в кредит"));

    public StartPage() {
        headingStart.shouldBe(visible);
    }

    public PaymentPage payment() {
        paymentButton.click();
        return new PaymentPage();
    }

    public CreditPage paymentOnCredit() {
        creditButton.click();
        return new CreditPage();
    }
}