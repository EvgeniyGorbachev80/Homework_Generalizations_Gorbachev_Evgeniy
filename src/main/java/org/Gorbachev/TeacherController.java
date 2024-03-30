package org.Gorbachev;

import java.util.List;
import java.util.Scanner;
public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String surname, String firstname, String patronymic) {
        teacherService.create(surname, firstname, patronymic);
    }

    public void createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher's surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter teacher's firstname: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter teacher's patronymic: ");
        String patronymic = scanner.nextLine();

        create(surname, firstname, patronymic);
        System.out.println("Teacher added successfully!");
    }

    public void editTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher ID to edit: ");
        int teacherId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Teacher teacher = teacherService.getTeacherById(teacherId);
        if (teacher != null) {
            System.out.print("Enter new surname: ");
            String surname = scanner.nextLine();
            System.out.print("Enter new firstname: ");
            String firstname = scanner.nextLine();
            System.out.print("Enter new patronymic: ");
            String patronymic = scanner.nextLine();
            teacherService.editTeacher(teacherId, surname, firstname, patronymic);
            System.out.println("Teacher information updated successfully!");
        } else {
            System.out.println("Teacher with ID " + teacherId + " not found.");
        }
    }

    public void displayTeachers() {
        List<Teacher> teachers = teacherService.getAll();
        if (teachers.isEmpty()) {
            System.out.println("No teachers in the system.");
        } else {
            System.out.println("List of teachers:");
            teacherView.display(teachers);
        }
    }
}
