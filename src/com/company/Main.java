package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Figure f = new Figure(3);
        try {
            System.out.println("Работаю с первой точкой");
            f.setCoord(0, 0, 0);
            System.out.println("Работаю со второй точкой");
            f.setCoord(1, 10, 0);
            System.out.println("Работаю с третьей точкой");
            f.setCoord(2,10, 10);
            System.out.println("Работаю с четвёртой точкой");
            f.setCoord(3,0, 10);
            System.out.println("Все!");
        }
        catch (PointIndexException e){
            System.out.print(e.getMessage()+": "+e.getIndex());
        }

        File f = new File("C/IVBO-01-19/B.txt");

        /*try {
            int a = 10;
            int b = 0;
            int c = a / b;
            int []bb = {1, 2};
            int m = bb[8];
        }
        catch (ArrayIndexOutOfBoundsException|ArithmeticException e ){
            System.out.println("Что-то плохое случилось:"+e.toString());
        }
        catch (Exception add){
            System.out.println("Что-то плохое случилось:"+add.getMessage());
        }
        finally {
            System.out.println("Всегда!!!");
        }
        System.out.println("Что-то после....");*/
    }
}
