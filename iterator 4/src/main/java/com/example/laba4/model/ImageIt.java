package com.example.laba4.model;

import javafx.scene.image.Image;

// создать класс который выводит ImageIt image + message

public class ImageIt implements Iterator {
    private int current = 0;
    private Image image;
    private Images images = new Images();

    @Override
    public boolean hasNext() {
        String filename = "/" + (current + 1) + ".BMP";
        try {
            image = new Image(filename);
//            images.setString("Current string " + current + 1);
//            System.out.println(images.getString());
            return true;
        } catch (Exception ex) {
            current = 0;
            image = new Image("/" + (current + 1) + ".BMP");
            return true;
        }
    }


    @Override
    public Images next() {
        current++;
        images.setString("Next message " + current);
        System.out.println(images.getString());
        images.setImage(image);
        return images;
    }

    public boolean hasPreview() {
        String filename = null;
        if (current >= 2) {
            filename = "/" + (current - 1) + ".BMP";
        }
        try {
            image = new Image(filename);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Не загружается картинка " + filename);
            return false;
        }
    }

    @Override
    public Images preview() {
        current--;
        images.setString("Preview message " + current);
        System.out.println(images.getString());
        images.setImage(image);
        return images;
    }
}
