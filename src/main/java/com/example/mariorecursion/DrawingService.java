package com.example.mariorecursion;

public class DrawingService {

    public void callDraw(int height){
        draw(height, 0);
    }

    private void draw(int height, int spaceNumber) {

        if(height == 0) {
            return;
        }

        draw(height-1, spaceNumber+1);

        String space = " ";
        String hashtag = "#";
        System.out.print(space.repeat(spaceNumber)+hashtag.repeat(height)+space+hashtag.repeat(height)+space.repeat(spaceNumber)+"\n");

    }
}
