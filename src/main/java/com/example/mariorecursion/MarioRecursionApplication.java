package com.example.mariorecursion;

import java.util.Scanner;

public class MarioRecursionApplication {

    public static void main(String[] args) {
        DrawingService dw = new DrawingService();
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite a altura da escada do mário: ");
        int height = scn.nextInt();
        dw.callDraw(height);
    }

}
