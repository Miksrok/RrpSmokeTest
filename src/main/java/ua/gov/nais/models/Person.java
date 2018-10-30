package ua.gov.nais.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    private String fullName;

    private String id;

    private String passport;

    private String passportDate;

    private String passportPublisher;

    public Person(){
        this.fullName = "Тестовий Робот Автоматович";
        this.passport = "ФФ123456";
        this.passportDate = "11.11.2012";
        this.passportPublisher = "Зірка смерті";
    }
    {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmss");
        this.id = format.format(date);
    }

    public String getFullName() {
        return fullName;
    }

    public String getId() {
        return id;
    }

    public String getPassport() {
        return passport;
    }

    public String getPassportDate() {
        return passportDate;
    }

    public String getPassportPublisher() {
        return passportPublisher;
    }
}
