package com.company;

import java.util.ArrayList;
import java.util.List;

//01. Напишіть клас Statistic для зберігання числових даних деякого
//експерименту. Додайте методи:






public class Statistic {

   private static List<Double> data = new ArrayList<Double>();

    // додавання результату експерименту;
   public void AddResult(double result){
       data.add(result);
   }
    // знаходження медіани результатів експерименту;
    public double MedianResult(){
       return data.get(data.size()/2-1);
    }
   // знаходження мінімального/максимального значення у сукупності
    //даних;
   public double MaxResult(){
       double max = data.get(0);
       for (int i = 0;i<data.size();i++){
           if(data.get(i)>max){
               max = data.get(i);
           }
       }
       return max;
   }
    public double MinResult(){
        double min = data.get(0);
        for (int i = 0;i<data.size();i++){
            if(data.get(i)<min){
                min = data.get(i);
            }
        }
        return min;
    }
   // знаходження середнього арифметичного результатів
    //експерименту;
   public double AvarageResult(){
       double value = 0;
       for (int i = 0;i<data.size();i++){
           value+= data.get(i);
       }
       return value/data.size() ;
   }
    // знаходження моди результатів експерименту;
    public  double ModeResult() {
        double  mode = data.get(0);
        int maxCount = 0;
        for (int i = 0; i < data.size(); i++) {
            double value = data.get(i);
            int count = 0;
            for (int j = 0; j < data.size(); j++) {
                if (data.get(j) == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        if (maxCount > 1) {
            return mode;
        }
        return 0;
    }
    // знаходження кількості елементів більших/менших за середнє
//арифметичне.
    public int BiggerThanAvarage(){
       int counter = 0;
       double avarage = AvarageResult();
        for (int j = 0; j < data.size(); j++) {
            if(data.get(j)>avarage){
                counter++;
            }
        }
        return counter;
    }
    public int SmallerThanAvarage(){
        int counter = 0;
        double avarage = AvarageResult();
        for (int j = 0; j < data.size(); j++) {
            if(data.get(j)<avarage){
                counter++;
            }
        }
        return counter;
    }

}
