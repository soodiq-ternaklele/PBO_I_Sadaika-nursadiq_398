package com.example.codelab_modul_6;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.util.Random;

public class TebakAngkaView {
    private VBox root;
    private int angkaAcak;
    private int percobaan;

    public TebakAngkaView() {
        root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: white ; -fx-padding: 20;");

        Random random = new Random();
        angkaAcak = random.nextInt(100) + 1;
        percobaan = 0;

        Label judul = new Label(" Tebak Angka 1–100");
        judul.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: purple;");

        Label feedback = new Label();
        feedback.setStyle("-fx-font-size: 14px; -fx-text-fill: black;");

        TextField inputField = new TextField();
        inputField.setPromptText("Masukkan angka di sini");
        inputField.setPrefWidth(150);
        inputField.setStyle("-fx-font-size: 14px;");

        Button tombolTebak = new Button("Tebak!");
        tombolTebak.setStyle("-fx-background-color: #4caf50; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 5 15;");

        Label labelPercobaan = new Label("Jumlah percobaan: 0");
        labelPercobaan.setStyle("-fx-font-size: 12px; -fx-text-fill: #333;");

        tombolTebak.setOnAction(e -> {
            String input = inputField.getText();
            try {
                int tebakan = Integer.parseInt(input);
                percobaan++;
                labelPercobaan.setText("Jumlah percobaan: " + percobaan);

                if (tebakan > angkaAcak) {
                    feedback.setText("️ Terlalu besar!");
                } else if (tebakan < angkaAcak) {
                    feedback.setText(" Terlalu kecil!");
                } else {
                    feedback.setText(" Tebakan benar!");
                    tombolTebak.setText("Main Lagi");
                    angkaAcak = random.nextInt(100) + 1;
                    percobaan = 0;
                }
            } catch (NumberFormatException ex) {
                feedback.setText("Masukkan angka yang valid!");
            }
            inputField.clear();
        });

        HBox inputBox = new HBox(10, inputField, tombolTebak);
        inputBox.setAlignment(Pos.CENTER);

        root.getChildren().addAll(judul, feedback, inputBox, labelPercobaan);
    }

    public VBox getRoot() {
        return root;
    }
}
