package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGame {

    /**
     * класс для запуска Монти Холла в цикле
     */
    public static void main(String[] args) {

        Player gamer = new Player("Игрок", true);
        int statisticWin = 0; // статистика Выигрыша
        int step; // step

        for (step = 0; step < 1000; step++) {
            Game game = new Game(gamer, getDoors());

            if (game.round(0).isPrize()) statisticWin++;
        }

        System.out.println("Из " + step + " игр игрок выиграл " + statisticWin);
    }
    private static List<Door> getDoors() { // создание дверей
        List<Door> doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
        Collections.shuffle(doors); // перемивание дверей
        return doors;
    }
}