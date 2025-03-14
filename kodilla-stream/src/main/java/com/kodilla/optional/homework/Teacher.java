package com.kodilla.optional.homework;

import java.util.Objects;

public class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
