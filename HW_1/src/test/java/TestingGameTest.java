import org.example.Door;
import org.example.Game;
import org.example.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestingGameTest {
    static List<Door> doors; // создаем три двери

    @BeforeEach
    void Doors() {
        doors = new ArrayList<>();
        doors.add(new Door(true));  // выигрыш
        doors.add(new Door(false)); // пусто
        doors.add(new Door(false)); // пусто
    }

    @Test
        // -------------- проверка, если игрок не меняет дверь выбрав приз и выигрывает --------------
    void WinNotChangeDoor() {
        //given - предусловия теста
        Player player = new Player("Игрок", false); // не меняет дверь
        Game game = new Game(player, doors);
        //when - вызов функционала, который мы проверяем
        Door door = game.round(0);
        // then — описываются утверждения
        Assertions.assertTrue(door.isPrize());
    }

    @Test
        // -------------- проверка, если игрок меняет дверь выбрав приз и проигрывает --------------
    void LoseChangeDoor() {
        //given - предусловия теста
        Player player = new Player("Игрок", true); // меняет дверь
        Game game = new Game(player, doors);
        //when - вызов функционала, который мы проверяем
        Door door = game.round(0);
        // then — описываются утверждения
        Assertions.assertFalse(door.isPrize());
    }

    @Test
        // -------------- проверка, если игрок меняет дверь выбрав не приз и выигрывает --------------
    void WinChangeDoor() {
        //given - предусловия теста
        Player player = new Player("Игрок", true); // меняет дверь
        Game game = new Game(player, doors);
        //when - вызов функционала, который мы проверяем
        Door door = game.round(1);
        // then — описываются утверждения
        Assertions.assertTrue(door.isPrize());
    }

    @Test
        // -------------- проверка, если игрок не меняет дверь выбрав не приз и проигрывает --------------
    void LoseNotChangeDoor() {
        //given - предусловия теста
        Player player = new Player("Игрок", false); // не меняет дверь
        Game game = new Game(player, doors);
        //when - вызов функционала, который мы проверяем
        Door door = game.round(1);
        // then — описываются утверждения
        Assertions.assertFalse(door.isPrize());
    }
}
