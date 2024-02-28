package ru.berezhnoy.seminar003;

import java.io.IOException;

public class Task002 {
    public static void main(String[] args) {
        int idx;
        try (Counter counter = new Counter()) {
            counter.add();
            counter.add();
            counter.add();
            System.out.println(counter.getIndex());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class Counter implements AutoCloseable{
    private Integer index;

    public Counter() {
        this.index = 0;
    }

    public void checkClose() throws IOException {
        if (this.index == null) {
            throw new IOException("Instance is closed");
        }
    }

    public int add() throws IOException {
        checkClose();
        return index++;
    }

    public Integer getIndex() {
        return index;
    }

    @Override
    public void close() throws Exception {
        this.index = null;
    }
}


