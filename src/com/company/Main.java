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


        Map<LocalDate, String> map = new HashMap<>();

        LocalDate date = LocalDate.of(2022, 1, 1);
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 1, 4);
        LocalDate date3 = LocalDate.of(2022, 1, 6);

        map.put(date1, "Telephones");
        map.put(date2, "Learn");
        map.put(date3, "Car");

        //  System.out.println(map);

        // проверяет в какие дни брались книги
        for (int i = 0; i < date.lengthOfMonth(); i++) {
            LocalDate dateD = date.plusDays(i);
            if (map.containsKey(dateD)) {
                System.out.println(dateD + " : " + map.get(dateD));
            }
        }

        System.out.println("Для поиска книг введите дату в формате YYYY-MM-DD");



            Scanner sc = new Scanner(System.in);
          LocalDate localDate;


        while(true){
            System.out.print("Enter a date in the format of YYYY-MM-DD:");
            String dateScanner = sc.next();
            try {
                localDate = LocalDate.parse(dateScanner);
                break;
            } catch (Exception e) {
                System.err.println("ERROR: Please input the date in the correct format");
            }
        }

       // System.out.println("The day of week is " + localDate.getDayOfWeek().name());
        System.out.println(localDate);






        //  LocalDate localDate = null;


//       if(year.matches("[0-9]{4}")){
//           System.out.println("asd");
//       } else{
//           System.out.println("давай еще раз");
//           year = sc.next();}

//        month = sc.nextInt();
//        day = sc.nextInt();

//        try{
//            getLocalDate(year,month,day);
//        }catch (){}


//        while (!localDate.isSupported(DAY_OF_MONTH))  {
//            System.out.println("NOOOOO");

        // тут вставить вывод текста: "для поиска введите  дату" + пример ввода формат дати YYYY-MM-DD
        // если неправильно введено то эксепшн и введите еще раз


        if (map.containsKey(localDate)) {
            System.out.println("В этот день брали: " + map.get(localDate));
        } else {
            System.out.println("В этот день книги не выдавались");
        }

    }
}

        // System.out.println(map);

//        map.put(20-10-19, "var");
//        map.put(22-10-19, "data");
//        map.put(23-10-19, "Learning");
//
//        System.out.println(map.get(22-10-19));
//
//        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
//            System.out.println(integerStringEntry);
//
//        }


//    private static LocalDate getLocalDate() throws DateTimeParseException { //
//        Scanner sc = new Scanner(System.in);
//        LocalDate localDate = LocalDate.parse(sc.next());
//        // return localDate;
////        if (localDate.isSupported(DAY_OF_MONTH)) {
////            System.out.println("ok");
////            return localDate;
////        }
////        else {
////            throw new DateTimeParseException();
////        }
//        return localDate;
    //}


//    private static boolean getLocalDate(String year, String month, String day) { // throws DateTimeParseException
//        int rangeYear = Integer.parseInt("[0-9]{4}");
//        int rangeMonthDay = Integer.parseInt("[0-9]{2}");
//        if(year.matches(String.valueOf(rangeYear))){


//  && (month.matches(String.valueOf(rangeMonthDay))) && (day.matches(String.valueOf(rangeMonthDay)))){


//            return true;
//        }
//        return true;
//    }


//   LocalDate localDate = LocalDate.parse(sc.next());


//    Scanner sc = new Scanner(System.in);
//    String year = sc.next();
//
//        while (!year.matches("[0-9]{4}")) {
//                System.out.println("повтори попытку");
//                year = sc.next();
//                }
//
//                System.out.println("cool");
//                System.out.println(year);
//
//                String month = sc.next();
//
//                while (!month.matches("[0-9]{2}")) {
//                System.out.println("повтори попытку");
//                month = sc.next();
//                }
//
//                System.out.println("cool");
//                System.out.println(month);

//           localDate.of(year,month,day);
