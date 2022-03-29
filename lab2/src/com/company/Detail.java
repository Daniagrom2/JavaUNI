package com.company;

import java.sql.Time;
import java.time.Year;
import java.util.Date;

//05. Створіть клас Detail, який буде використаний для подальшого створення
//        різних пристроїв (самі пристрої створювати не потрібно). Придумайте які
//        поля та методи потрібні в даному класі для реалізації таких функцій:
//         збереження даних про тип деталі: назва, торгова марка, країна
//        виробник, дата виробництва, час безвідмовної роботи,
//        багаторядкова примітка (в даному полі може міститись будь-яка
//        кількість рядків);
//         доступ (встановлення та отримання значень) до даних, що
//        зберігаються;

public class Detail {
    private String Name;
    private String Mark;
    private String Country;
    private Date CreationDare;
    private Year TimeOfWorking;
    private String Description;

    public void SetName(String name){
        Name =name;
    }
    public void SetMark(String mark){
        Mark = mark;
    }
    public void SetCountry(String country){
        Country = country;
    }
    public void SetCreationDare(Date creationDare){
        CreationDare = creationDare;
    }
    public void SetTimeOfWorking(Year timeOfWorking){
        TimeOfWorking = timeOfWorking;
    }
    public void SetDescription(String description){
        Description = description;
    }
    public String GetName(){
        return Name;
    }
    public String GetMark(){
        return Mark;
    }
    public String GetCountry(){
        return  Country;
    }
    public String GetDescription(){
        return Description;
    }
    public Date GetCreationDare(){
        return CreationDare;
    }
    public Year GetTimeOfWorking(){
        return TimeOfWorking;
    }

    Detail(){
        Name = "Unknown";
        Mark = "Unknown";
        Country = "Unknown";
        CreationDare = new Date(2000,11,17);
        TimeOfWorking = Year.now();
        Description ="Enpty";
    }
    Detail(String name,String mark,String country,Date creationDare,Year timeOfWorking,String description){
        Name = name;
        Mark = mark;
        Country = country;
        CreationDare = creationDare;
        TimeOfWorking = timeOfWorking;
Description = description;
    }

}
