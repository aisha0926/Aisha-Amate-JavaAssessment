package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Navigation nav = new Navigation();
        Player a = new Player();
        nav.addPlayer(a);
        nav.movement();

    }
}
