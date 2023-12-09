package org.example.HW__2;

public class Package implements Products { // упаковка
    @Override
    public void writeDown() {
        System.out.println("упаковка");
    }

    @Override
    public Long getSum() {
        //у Вас тут будет бесконечная рекурсия
        //Exception in thread "main" java.lang.StackOverflowError
        return getSum();
    }
}
