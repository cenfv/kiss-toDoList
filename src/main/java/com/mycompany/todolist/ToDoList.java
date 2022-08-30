package com.mycompany.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> toDoList = new ArrayList<>();

        while (true) {
            System.out.println("\n 0-List, 1-Add, 2-Mod, 3-Set as completed, 4-Del ");
            
            switch (Integer.parseInt(sc.nextLine())) {
                case 0 -> {
                    for (Object element : toDoList) {
                        System.out.println(toDoList.indexOf(element) + " - " + element);
                    }
                }
                case 1 -> {
                    ArrayList<String> task = new ArrayList();
                    System.out.println("Type an description");
                    task.add(sc.nextLine());
                    task.add("Not completed");
                    toDoList.add(task);
                }
                case 2 -> {
                    System.out.println("Enter the index of the task");
                    int pos = Integer.parseInt(sc.nextLine());
                    System.out.println("Type an description");
                    toDoList.get(pos).set(0, sc.nextLine());
                }
                case 3 -> {
                    System.out.println("Enter the index of the task");
                    toDoList.get(Integer.parseInt(sc.nextLine())).set(1, "Completed");
                }
                case 4 -> {
                    System.out.println("Enter the index of the task");
                    toDoList.remove(Integer.parseInt(sc.nextLine()));
                }

                default -> System.out.println("Invalid operation!");
            }
        }
    }

}
