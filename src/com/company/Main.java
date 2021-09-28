package com.company;

public class Main {

    static void printTile(Tile tile) {
        System.out.println(tile);
    }

    static void printDate(MyDate date){
        System.out.println(date);
    }

    public static void main(String[] args) {
        MyDate date1 = new MyDate(2002, "July",6);
        MyDate date2 = new MyDate();

        Tile tile1 = new Tile(10, 'c');
        printTile(tile1);

        Tile tile2 = new Tile(10, 'c');

        Tile tile3 = new Tile(5, 'z');

        System.out.println("tile1 equals tile 2: " + tile1.equals(tile2));
        System.out.println("tile1 equals tile 3: " + tile1.equals(tile3));

        char letter = tile3.getLetter();
        tile3.setLetter('w');

        printDate(date2);
        printDate(date1);

    }
}
