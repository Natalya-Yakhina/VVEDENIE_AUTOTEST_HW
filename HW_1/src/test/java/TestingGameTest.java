import org.example.Door;
import org.example.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestingGameTest {

    static List<Door> doors; // создаем три двери

    @Test

        // -------------- тест проверка, если игрок не меняет дверь и выигрывает --------------

    void WinNotChangeDoor() {
        //given - предусловия теста
        Player player = new Player("Игрок", false);



        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        //when - вызов функционала, который мы проверяем
        Door door = game.round(0);
        // then — описываются утверждения
        Assertions.assertTrue(door.isPrize());
    }
}
