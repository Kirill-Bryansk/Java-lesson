package ru.lesson.party;

import java.awt.*;
import java.awt.event.*;

public class Party {
    public void buildInvite() {
        Frame frame = new Frame();
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 150);

        Label l = new Label("Вечеринка у Кирилла");
        Button b = new Button("Загляну");
        Button c = new Button("Лучше застрелюсь");

        Panel p = new Panel();
        p.add(l);
        p.add(b);
        p.add(c);

        frame.add(p);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Party party = new Party();
        party.buildInvite();
    }
}
