package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampKind;
    private int length;
    private int width;
    private boolean stamped;

    public Stamp(String stampKind, int length, int width, boolean stamped) {
        this.stampKind = stampKind;
        this.length = length;
        this.width = width;
        this.stamped = stamped;
    }
    @Override
    public String toString() {
        return "Stamp{" +
                "stampKind='" + stampKind + '\'' +
                ", length= " + length +
                ", width= " + width +
                ", stamped= " + stamped +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp1 = (Stamp) o;
        return length == stamp1.length
                && width == stamp1.width
                && stamped == stamp1.stamped
                && Objects.equals(stampKind, stamp1.stampKind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampKind, length, width, stamped);
    }
}
