package com.company;
//02. Напишіть клас Dog для збереження даних про собаку. У класі передбачити
//        можливість збереження віку та клички собаки. Створити метод, під час
//        звернення до якого, на екран буде виводитись слово «гав» стільки разів,
//        скільки років собаці. Приклад оголошення класу може бути таким:
//
//
//03. Доповніть клас із завдання 2 конструктором без аргументів, у якому значення
//        віку дорівнюватиме 0, а кличка буде «Незнайомець». А також, додайте
//        конструктор з двома параметрами – віком та кличкою. Після реалізації таких
//        конструкторів об’єкти класу Dog можна буде створювати наступним чином:

public class Dog {
    private static int DogsCount = 0;
    private String Name;
    private int Age;
    Dog(){
Name = "Stranger";
Age = 0;
DogsCount++;
    }
    Dog(String name,int age){
        Name = name;
        Age = age;
        DogsCount++;
    }
    public void Gav(){
        for (int i = 0;i<Age;i++)
        System.out.println("Gav");
    }
    public void SetName(String name){
        this.Name = name   ;
    }
    public void SetAge(int age){
        this.Age = age   ;
    }
    public String GetName(){
        return Name;
    }
    public int GetAge(){
        return Age;
    }
    public static void ShowCount(){
        System.out.println(DogsCount);
    }


}
