package com.company;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        LocalDate localDate;
        LocalDate dateMin = LocalDate.of(9999, 12, 31);
        LocalDate dateMax = LocalDate.of(0000, 01, 01);

        Scanner sc = new Scanner(System.in);
        Map<LocalDate, String> map = new HashMap<>();

        LocalDate date = LocalDate.of(2022, 1, 1);
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 1, 4);
        LocalDate date3 = LocalDate.of(2022, 2, 6);
        LocalDate date4 = LocalDate.of(2022, 1, 12);
        LocalDate date5 = LocalDate.of(2022, 1, 16);
        LocalDate date6 = LocalDate.of(2022, 2, 23);
        LocalDate date7 = LocalDate.of(2022, 1, 27);
        LocalDate date8 = LocalDate.of(2022, 1, 28);
        LocalDate date9 = LocalDate.of(2022, 1, 29);

        map.put(date1, "Telephones");
        map.put(date2, "Red Comet");
        map.put(date3, "When We Cease to Understand the World");
        map.put(date4, "No One Is Talking About This");
        map.put(date5, "The Love Songs");
        map.put(date6, "Intimacies");
        map.put(date7, "Behold the Dreamers");
        map.put(date8, "SpaceX");
        map.put(date9, "Java");

        for (int i = 0; i < date.lengthOfYear(); i++) {   // for(Map.Entry<LocalDate, String> mapEntry : map.entrySet()){}
            LocalDate dateD = date.plusDays(i);
            if (map.containsKey(dateD)) {
                System.out.println(dateD + " : " + map.get(dateD));

                if (dateMax.compareTo(dateD) < 0) {
                    dateMax = dateD;
                }
                if (dateMin.compareTo(dateD) > 0) {
                    dateMin = dateD;
                }
            }
        }

        System.out.println("период за который брались книги: " + dateMin + " - " + dateMax);
        System.out.println("--------------------------------------------------------");
        System.out.println("Для поиска книг введите дату в формате YYYY-MM-DD: ");

        while (true) {
            String dateScanner = sc.next();
            try {
                localDate = LocalDate.parse(dateScanner);
                break;
            } catch (Exception e) {
                System.err.println("Не верный ввод, формат ввода даты -> YYYY-MM-DD: ");
            }
        }
        System.out.println("Вы ввели: " + localDate);

        if (map.containsKey(localDate)) {
            System.out.println("В этот день брали: " + map.get(localDate));
        } else {
            System.out.println("В этот день книги не выдавались");
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("За период указаный выше, получали такие книги:");

        for (Map.Entry<LocalDate, String> mapEntry : map.entrySet()) {
            System.out.println("* " + mapEntry.getValue());
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("ЗАДАНИЕ СО ЗВЕЗДОЧКОЙ");
        System.out.println("--------------------------------------------------------");

        Map<LocalDate, List<String>> hm = new HashMap<LocalDate, List<String>>();
        List<String> book1 = new ArrayList<String>();
        List<String> book2 = new ArrayList<String>();
        List<String> book3 = new ArrayList<String>();

        book1.add("Intimacies");
        book2.add("Telephones");
        book2.add("The Love Songs");
        book3.add("Red Comet");
        book3.add("No One Is Talking About This");
        book3.add("When We Cease to Understand the World");

        hm.put(date1, book1);
        hm.put(date2, book2);
        hm.put(date3, book3);
        hm.put(date4, Collections.singletonList("Telephones"));
        hm.put(date5, Collections.singletonList("Behold the Dreamers"));
        hm.put(date6, book2);
        hm.put(date7, book3);
        hm.put(date8, Collections.singletonList("No One Is Talking About This"));
        hm.put(date9, book2);

        for (int i = 0; i < date.lengthOfMonth(); i++) {   // for(Map.Entry<LocalDate, String> mapEntry : map.entrySet()){}
            LocalDate dateM = date.plusDays(i);
            if (hm.containsKey(dateM)) {
                System.out.println(dateM + " : " + hm.get(dateM).size());
            } else {
                System.out.println(dateM + " : 0");
            }
        }

        System.out.println("Для поиска книг введите дату в формате YYYY-MM-DD: ");

        while (true) {
            String dateScanner = sc.next();
            try {
                localDate = LocalDate.parse(dateScanner);
                break;
            } catch (Exception e) {
                System.err.println("Не верный ввод, формат ввода даты -> YYYY-MM-DD: ");
            }
        }
        System.out.println("Вы ввели: " + localDate);

        if (hm.containsKey(localDate)) {
            System.out.println("В этот день брали: " + hm.get(localDate));
        } else {
            System.out.println("В этот день книги не выдавались");
        }
    }
}