package Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Worker worker = new Worker();
        Worker worker1 = new Worker();


        System.out.println("Введите Имена:");
        String name = scanner.nextLine();
        worker.setName(name);
        String name1 = scanner.nextLine();
        worker1.setName(name1);


        System.out.println("Введите должность:");
        String jobtitle = scanner.nextLine();
        worker.setJobtitle(jobtitle);
        String jobtitle1 = scanner.nextLine();
        worker1.setJobtitle(jobtitle1);

        System.out.println("Введите стаж:");


        int experience = scanner.nextInt();
        worker.setExperience(experience);
        int experience1 = scanner.nextInt();
        worker1.setExperience(experience1);


        System.out.println("Ввведите год поступления на работу:");
        try {
            int year = scanner.nextInt();

            int year1 = scanner.nextInt();

            if (experience + year < 2022 )
                System.out.println(worker.getName()+"  "+"стаж работы превышает введенное значение");
            else if (experience1 + year1 < 2022)
                System.out.println(worker1.getName()+"  "+ "стаж работы превышает введенное значение");
            else {
                worker.setYear(year);
                worker1.setYear(year1);
            }
        } catch (Exception e) {
            System.out.println("Введите год числом");


            ArrayList<Worker> people = new ArrayList<>();
            people.add(worker);
            people.add(worker1);
            people.indexOf(worker);


            Collections.sort(people);
            System.out.println(people);


        }


    }
}

