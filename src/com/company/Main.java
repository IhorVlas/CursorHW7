package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;

public class Main {


    public static void main(String[] args) {
//        Вы посетитель библиотеки.
//        Каждый раз, когда вы берете книгу, она также должна быть добавлена в библиотечный отчет.
//        Отчет состоит из даты (когда вы взяли книгу), названия книги. Для дат используйте LocalDate
//        Реализуйте эту структуру, используя Map. Добавьте функционал поиска на карте по датам.
//        Ф.э. for 20-10-19 вернет название книги.
//        Если книг на эту дату нет - ответное сообщение типа "Нет книг на эту дату" (или что-то подобное).
//
//        Также вернуть диапазон дат изъятых книг и отдельно список книг для всего диапазона.
        //  походу вернуть вывести крайние даты (книги брали с по), и список книг какие брались
//
//        *Переписать функционал так, чтобы можно было брать несколько книг за один день.
//        Возвращает диапазон дат для ОДНОГО месяца (день за днем в хронологическом порядке) с количеством книг.
//        Если за определенный день нет взятых книг, вернуть 0 в качестве значения.
//        Ф.э. 01.01.2020 - 2
//        01.02.2020 - 0

        LocalDate localDate;
        LocalDate dateMin = LocalDate.of(9999, 12, 31);
        LocalDate dateMax = LocalDate.of(0000, 01, 01);

        Map<LocalDate, String> map = new HashMap<>();

        LocalDate date = LocalDate.of(2022, 1, 1);
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 1, 4);
        LocalDate date3 = LocalDate.of(2022, 2, 6);
        LocalDate date4 = LocalDate.of(2022, 1, 12);
        LocalDate date5 = LocalDate.of(2022, 1, 16);
        LocalDate date6 = LocalDate.of(2022, 2, 23);
        LocalDate date7 = LocalDate.of(2022, 1, 27);

        map.put(date1, "Telephones");
        map.put(date2, "Red Comet");
        map.put(date3, "When We Cease to Understand the World");
        map.put(date4, "No One Is Talking About This");
        map.put(date5, "The Love Songs");
        map.put(date6, "Intimacies");
        map.put(date7, "Behold the Dreamers");

        // проверяет в какие дни брались книги

        for (int i = 0; i < date.lengthOfYear(); i++) {
            LocalDate dateD = date.plusDays(i);
            if (map.containsKey(dateD)) {
                System.out.println(dateD + " : " + map.get(dateD));

                if(dateMax.compareTo(dateD) < 0) {
                    dateMax = dateD;
                    //System.out.println("dateMax = " + dateMax);
                }
                if(dateMin.compareTo(dateD) > 0){
                    dateMin = dateD;
                    //System.out.println("dateMin" + dateMin);
                }
            }
        }

        System.out.println("период за который брались книги: " + dateMin + " - " + dateMax);
        System.out.println("--------------------------------------------------------");

        // тут вставить вывод текста: "для поиска введите  дату" + пример ввода формат дати YYYY-MM-DD
        // если неправильно введено то эксепшн и введите еще раз

        System.out.println("Для поиска книг введите дату в формате YYYY-MM-DD: ");
        Scanner sc = new Scanner(System.in);

        while (true) {
            // System.out.print("Enter a date in the format of YYYY-MM-DD:");
            String dateScanner = sc.next();
            try {
                localDate = LocalDate.parse(dateScanner);
                break;
            } catch (Exception e) {
                System.err.println("Не верный ввод, формат ввода даты -> YYYY-MM-DD: ");
            }
        }
        System.out.println(localDate);

        if (map.containsKey(localDate)) {
            System.out.println("В этот день брали: " + map.get(localDate));
        } else {
            System.out.println("В этот день книги не выдавались");
        }

        System.out.println("вывод ");

      //  Optional<Map.Entry<Item, Boolean>> firstEntry =  processedItem.entrySet().stream().findFirst();
        for(Map.Entry<LocalDate, String> firstEntry : map.entrySet()){
            System.out.println(firstEntry.getKey());
        }
    }
}








