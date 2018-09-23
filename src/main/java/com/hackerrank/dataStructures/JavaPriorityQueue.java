package com.hackerrank.dataStructures;

import java.util.*;

class Priorities {
    static List<StudentClass> getStudents(List<String> events) {
        PriorityQueue<StudentClass> queue = new PriorityQueue<>(events.size(),
                Comparator.comparingDouble(StudentClass::getCgpa).reversed().thenComparing(StudentClass::getName).reversed()
                        .thenComparingInt(StudentClass::getId).reversed());
        for (String event : events) {
            String[] eventParts = event.split(" ");
            if (eventParts.length > 1) {
                queue.add(new StudentClass(Integer.valueOf(eventParts[3]), eventParts[1], Double.valueOf(eventParts[2])));
            } else {
                queue.poll();
            }
        }

        return new ArrayList<>(queue);
    }

}


class StudentClass {
    private int id;
    private String name;
    private double cgpa;

    public StudentClass(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<StudentClass> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (StudentClass st : students) {
                System.out.println(st.getName());
            }
        }
    }
}