package com.virtualprojectslab;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //int zavzame veliksot 32 bitov
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myToatal = (myMinValue/2);
        //byte zavzame manj prostora vendar lahko spravi vase številek od -128 do 127 = 256 skupaj = 8 bitov
        byte myByteValue = -128;

        //java v izrazih (enčbah) pretvori byte v int, ki zavazme več bitov in zato dobimo error.
        //zato damo spredaj (byte) da obravnava izraz kot byte
        byte myNewByteValue = (byte) (myByteValue/2);

        //short zavzame 2*byte velikost = 65xxx skupaj = 16 bitov
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);

        //long mora imeti na koncu številke L, zavzame 64 bitov
        long myLongvalue = 9_223_372_036_854_775_807L;

        byte myByteTest = 10;
        short myShortTest = 20;
        int myIntTest = 50;
        long myLongTest = 50000L + 10L * (myByteTest + myShortTest + myIntTest);
        short myShortTest2 = (short) (1000 + 10 * (myByteTest + myShortTest + myIntTest));


        System.out.println(myShortTest2);

    }
}
