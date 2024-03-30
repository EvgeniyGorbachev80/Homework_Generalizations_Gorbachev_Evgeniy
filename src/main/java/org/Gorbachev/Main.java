package org.Gorbachev;

// todo ООП: Обобщения. ч1
//  1. Создать класс УчительСервис и реализовать аналогично проделанному на семинаре.
//  2. Создать класс УчительВью и реализовать аналогично проделанному на семинаре.
//  3. Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного
//     учителя и отображения списка учителей, имеющихся в системе.

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        TeacherController teacherController = new TeacherController();
        while (flag) {
            System.out.println("===========================");
            System.out.println("1 - Add a new teacher");
            System.out.println("2 - Edit teacher information");
            System.out.println("3 - Display list of teachers");
            System.out.println("0 - Exit the application");
            System.out.println("===========================");
            int num = MyTools.inputPositiveNumber("Enter the task number: ");

            switch (num) {
                case 1:
                    teacherController.createTeacher();
                    break;
                case 2:
                    teacherController.editTeacher();
                    break;
                case 3:
                    teacherController.displayTeachers();
                    break;
                case 0:
                    flag = false;
                    System.out.println("\nUntil we meet again!");
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("\nNo task with such number.");
                    break;
            }
        }
    }
}
