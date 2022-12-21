package com.example.laba4;

import com.example.laba4.model.ImageIt;
import com.example.laba4.model.Images;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import com.example.laba4.model.Iterator;
import javafx.event.ActionEvent;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public ImageView view;
    @FXML
    public Label text;

    public Iterator imageIt = new ImageIt();
    public Timeline timeline = new Timeline();

    public void onForwardButton(ActionEvent actionEvent) {
        if (imageIt.hasNext()) {
            Images name = imageIt.next();
            view.setImage(name.getImage());
            text.setText(name.getString());
            if (name.getString().isEmpty() == true) {
                System.out.println(false);
            } else {
                System.out.println(1 + " " + name.getString());
            }        }
    }

    public void onBackButton(ActionEvent event) {
        if (imageIt.hasPreview()) {
            Images name = imageIt.preview();
            view.setImage(name.getImage());
            text.setText(name.getString());
            if (name.getString().isEmpty() == true) {
                System.out.println(false);
            } else {
                System.out.println(2 + " " + name.getString());
            }
        }
    }

    public void onLaunchButton(ActionEvent event) {
        timeline.play();
    }

    public void onStopButton(ActionEvent event) {
        timeline.stop();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(new KeyFrame(new Duration(1000), new EventHandler() {
            @Override
            public void handle(Event event) {
                if (imageIt.hasNext()) {
                    view.setImage(imageIt.next().getImage());
                }
            }
        }));
    }
}