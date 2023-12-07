package org.example;

public class Player {
    /**
     * Класс для описания игрока
     */
    //имя игрока
    private String name;
    //стратегия игрока, если true игрок меняет дверь
    private boolean risk;

    public Player(String name, boolean risk) {
        this.name = name;
        this.risk = risk;
    }

    public String getName() {
        return name;
    }

    public boolean getRisk() {
        return risk;
    }
}
