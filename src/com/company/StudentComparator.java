package com.company;

import java.util.Comparator;

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//        return (int)(o1.getMarks() - o2.getMarks());
//        return Double.valueOf(o1.getMarks()).compareTo(o2.getMarks());
        if (o1.getMarks() > o2.getMarks())
            return -1;
        else if (o1.getMarks() < o2.getMarks())
            return 1;
        else
            return 0;
    }
}