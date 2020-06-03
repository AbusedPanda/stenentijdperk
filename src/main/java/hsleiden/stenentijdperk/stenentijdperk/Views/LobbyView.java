package hsleiden.stenentijdperk.stenentijdperk.Views;

import hsleiden.stenentijdperk.stenentijdperk.Controllers.LobbyController;
import hsleiden.stenentijdperk.stenentijdperk.Models.PlayerModel;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;

public class LobbyView {
    private LobbyController controller;
    private PlayerModel playermodel;
    private GridPane view;

    public LobbyView(LobbyController controller, PlayerModel model) {
        this.controller = controller;
        this.playermodel = model;

        setupPane();
    }
    public Parent setScene() {
        return view;
    }

    private void setupPane() {
        this.view = new GridPane();
        this.view.setPadding(new Insets(10, 10, 10, 10));
        this.view.setStyle("-fx-background-color: d0c9b5");
        int amountOfRows = 50;
        int amountOfColumns = 50;

        for(int i = 0; i < amountOfColumns; i++) {
            ColumnConstraints columnConstraints = new ColumnConstraints();
            columnConstraints.setPercentWidth(100 / amountOfColumns);
            this.view.getColumnConstraints().add(columnConstraints);
        }
        for(int j = 0; j < amountOfRows; j++) {
            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPercentHeight(100 / amountOfRows);
            this.view.getRowConstraints().add(rowConstraints);
        }


        Label welkomLabel = new Label("Hallo NAAM, je hebt keuze uit deze lobby's");
        welkomLabel.setStyle("-fx-font-size: 20px; ");
        GridPane.setConstraints(welkomLabel, 1, 1, 48, 3);

        Button lobbyButton1 = new Button("Lobby 1");
        lobbyButton1.setMinWidth(373);
        lobbyButton1.setMinHeight(100);
        lobbyButton1.setStyle("-fx-background-color: #dfa231; -fx-text-fill: #f6e5b6; -fx-border-color:#453b1b; -fx-border-width: 1px; -fx-border-radius: 1px; -fx-font-size: 2em;");

        Button lobbyButton2 = new Button("Lobby 2");
        lobbyButton2.setMinWidth(373);
        lobbyButton2.setMinHeight(100);
        lobbyButton2.setStyle("-fx-background-color: #dfa231; -fx-text-fill: #f6e5b6; -fx-border-color:#453b1b; -fx-border-width: 1px; -fx-border-radius: 1px; -fx-font-size: 2em;");

        Button lobbyButton3 = new Button("Lobby 3");
        lobbyButton3.setMinWidth(373);
        lobbyButton3.setMinHeight(100);
        lobbyButton3.setStyle("-fx-background-color: #dfa231; -fx-text-fill: #f6e5b6; -fx-border-color:#453b1b; -fx-border-width: 1px; -fx-border-radius: 1px; -fx-font-size: 2em;");

        Button lobbyButton4 = new Button("Lobby 4");
        lobbyButton4.setMinWidth(373);
        lobbyButton4.setMinHeight(100);
        lobbyButton4.setStyle("-fx-background-color: #dfa231; -fx-text-fill: #f6e5b6; -fx-border-color:#453b1b; -fx-border-width: 1px; -fx-border-radius: 1px; -fx-font-size: 2em;");

        Button lobbyButton5 = new Button("Lobby 5");
        lobbyButton5.setMinWidth(373);
        lobbyButton5.setMinHeight(100);
        lobbyButton5.setStyle("-fx-background-color: #dfa231; -fx-text-fill: #f6e5b6; -fx-border-color:#453b1b; -fx-border-width: 1px; -fx-border-radius: 1px; -fx-font-size: 2em;");



        VBox vbox = new VBox(lobbyButton1, lobbyButton2, lobbyButton3, lobbyButton4, lobbyButton5);

        // Set content for ScrollPane
//        scrollPane.setContent(button);
        ScrollPane lobbyScrollPane = new ScrollPane();
        lobbyScrollPane.setContent(vbox);
        lobbyScrollPane.setStyle("-fx-background-color: black;");
        lobbyScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        GridPane.setConstraints(lobbyScrollPane, 1, 5, 25, 30);

        ScrollPane informationScrollPane = new ScrollPane();
        informationScrollPane.setStyle("-fx-background-color: black;");
        informationScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        GridPane.setConstraints(informationScrollPane, 30, 5, 18, 15);

        Button joinLobbyButton = new Button("Join");
        joinLobbyButton.setMinSize(280, 120);
        joinLobbyButton.setMaxSize(280, 120);
        joinLobbyButton.setStyle("-fx-background-color: #dfa231; -fx-text-fill: #f6e5b6; -fx-border-color:#453b1b; -fx-border-width: 1px; -fx-border-radius: 1px; -fx-font-size: 2em;");
        GridPane.setConstraints(joinLobbyButton, 30, 26, 10, 10);

        this.view.getChildren().addAll(welkomLabel, lobbyScrollPane, informationScrollPane, joinLobbyButton);

    }
}