package com.evgeny.order;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){

        HBox registry = new HBox();
        Label reg = new Label("Регистрация");
        reg.setFont(new Font(24));
        registry.setAlignment(Pos.CENTER);
        HBox.setMargin(reg, new Insets(5.0, 0, 0, 0));
        registry.getChildren().add(reg);
        HBox textAfterRegistry = new HBox();
        Text textAfterReg = new Text("Здесь вы можете зарегистрировать Вашу карту и первыми получать" +
                " самую актуальную информацию о скидках, акциях, новых организациях-партнерах и многое другое.");
        textAfterRegistry.setAlignment(Pos.CENTER);
        textAfterReg.setFont(new Font(12.0));
        textAfterReg.setLineSpacing(5.0);
        textAfterReg.setTextAlignment(TextAlignment.CENTER);
        textAfterReg.wrappingWidthProperty().set(490.0);
        HBox.setMargin(textAfterReg, new Insets(3.0,0,0,0));
        textAfterRegistry.getChildren().add(textAfterReg);
        HBox fio = new HBox();
        Text name = new Text("Ваше имя:");
        TextField nameF = new TextField();
        nameF.setPrefColumnCount(15);
        nameF.setPromptText("Иван");
        VBox nameField = new VBox(name, nameF);
        Text lastName = new Text("Ваша фамилия:");
        TextField lastNameF = new TextField();
        lastNameF.setPromptText("Иванов");
        lastNameF.setPrefColumnCount(15);
        VBox lastNameFielf = new VBox(lastName, lastNameF);
        nameField.setSpacing(5.0);
        lastNameFielf.setSpacing(5.0);
        fio.setAlignment(Pos.CENTER);
        HBox.setMargin(nameField, new Insets(20.0,0,0,0));
        HBox.setMargin(lastNameFielf, new Insets(20.0,0,0,0));
        fio.setSpacing(100.0);
        fio.getChildren().addAll(nameField, lastNameFielf);
        HBox birth = new HBox();
        Text inputDate = new Text("Дата рождения:");
        birth.setAlignment(Pos.CENTER);
        birth.getChildren().add(inputDate);
        HBox.setMargin(inputDate, new Insets(10.0,0,0,0));
        HBox date = new HBox();
        ObservableList<Integer> day = FXCollections.observableArrayList(1 , 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31);
        ComboBox<Integer> days = new ComboBox<>(day);
        days.promptTextProperty().set("День");
        ObservableList<String> month = FXCollections.observableArrayList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        ComboBox<String> months = new ComboBox<>(month);
        months.promptTextProperty().set("Месяц");
        ObservableList<Integer> year = FXCollections.observableArrayList(getYear());
        ComboBox<Integer> years = new ComboBox<>(year);
        years.promptTextProperty().set("Год");
        years.setPrefWidth(120.0);
        months.setPrefWidth(120.0);
        days.setPrefWidth(120.0);
        date.setSpacing(50.0);
        date.setAlignment(Pos.CENTER);
        HBox.setMargin(days, new Insets(5.0,0,0,0));
        HBox.setMargin(months, new Insets(5.0,0,0,0));
        HBox.setMargin(years, new Insets(5.0,0,0,0));
        date.getChildren().addAll(days, months, years);
        HBox card = new HBox();
        VBox cardBox = new VBox();
        Text cardEntry = new Text("Номер карты (19 цифр):");
        TextField inputCard = new TextField();
        inputCard.setPromptText("0783540000000000000");
        inputCard.setPrefColumnCount(40);
        cardBox.getChildren().addAll(cardEntry, inputCard);
        cardBox.setSpacing(5.0);
        card.setAlignment(Pos.CENTER);
        HBox.setMargin(cardBox, new Insets(20.0, 0,0,0));
        card.getChildren().add(cardBox);
        HBox email = new HBox();
        VBox emailBox = new VBox();
        Text emailEntry = new Text("Введите ваш E-mail:");
        TextField inputEmail = new TextField();
        inputEmail.setPromptText("ivan@gmail.com");
        inputEmail.setPrefColumnCount(40);
        emailBox.getChildren().addAll(emailEntry, inputEmail);
        emailBox.setSpacing(5.0);
        email.setAlignment(Pos.CENTER);
        HBox.setMargin(emailBox, new Insets(20.0,0,0,0));
        email.getChildren().add(emailBox);
        //
        HBox num = new HBox();
        VBox numBox = new VBox();
        Text numEntry = new Text("Введите ваш номер телефона:");
        TextField inputNum = new TextField();
        inputNum.setPromptText("+375291234567");
        inputNum.setPrefColumnCount(40);
        numBox.getChildren().addAll(numEntry, inputNum);
        numBox.setSpacing(5.0);
        num.setAlignment(Pos.CENTER);
        HBox.setMargin(numBox, new Insets(20.0,0,0,0));
        num.getChildren().add(numBox);
        HBox place = new HBox();
        VBox oblBox = new VBox();
        ObservableList<String> obl = FXCollections.observableArrayList("Minsk", "Brest", "Vitebsk", "Gomel", "Grodno", "Mogilev");
        ComboBox<String> obls = new ComboBox<>(obl);
        obls.promptTextProperty().set("- Не выбрано -");
        Text oblInt = new Text("Город проживания:");
        oblBox.setSpacing(5.0);
        oblBox.getChildren().addAll(oblInt, obls);
        place.setAlignment(Pos.CENTER);
        place.getChildren().add(oblBox);
        HBox.setMargin(oblBox, new Insets(20.0,0,0,0));
        obls.setPrefWidth(470.0);
        HBox pass = new HBox();
        VBox firstPass = new VBox();
        Text passInp = new Text("Пароль:");
        TextField passw1 = new TextField();
        passw1.setPrefColumnCount(15);
        firstPass.setSpacing(5.0);
        firstPass.getChildren().addAll(passInp, passw1);
        VBox secondPass = new VBox();
        Text passInp2 = new Text("Повторите пароль:");
        TextField passw2 = new TextField();
        passw2.setPrefColumnCount(15);
        secondPass.setSpacing(5.0);
        secondPass.getChildren().addAll(passInp2, passw2);
        pass.getChildren().addAll(firstPass, secondPass);
        pass.setAlignment(Pos.CENTER);
        HBox.setMargin(firstPass, new Insets(20.0,0,0,0));
        HBox.setMargin(secondPass, new Insets(20.0,0,0,0));
        pass.setSpacing(100.0);
        HBox textBelow = new HBox();
        Text below = new Text("На указанный Email будет отправлено письмо для активации личного кабинета.");
        below.setLineSpacing(5.0);
        below.setTextAlignment(TextAlignment.CENTER);
        below.wrappingWidthProperty().set(490.0);
        textBelow.setAlignment(Pos.CENTER);
        textBelow.getChildren().add(below);
        HBox.setMargin(below, new Insets(30.0, 0,0,0));
        HBox persData = new HBox();
        CheckBox box = new CheckBox();
        Text dataApproval = new Text("Согласен(а) на обработку персональных данных");
        HBox.setMargin(box, new Insets(10.0,0,0,0));
        HBox.setMargin(dataApproval, new Insets(10.0,0,0,0));
        persData.setSpacing(5.0);
        persData.setAlignment(Pos.CENTER);
        persData.getChildren().addAll(box, dataApproval);
        HBox regButton = new HBox();
        Button regBut = new Button();
        regBut.setText("Зарегистрироваться");
        regButton.setAlignment(Pos.CENTER);
        HBox.setMargin(regBut, new Insets(10.0,0,0,0));
        regBut.setFont(new Font(14));
        Button reset = new Button();
        reset.setText("Очистить заявку");
        reset.setFont(new Font(14));
        HBox.setMargin(reset, new Insets(10.0,0,0,0));
        regButton.setSpacing(25.0);
        regButton.getChildren().addAll(regBut, reset);
        HBox check = new HBox();
        Label checker = new Label();
        check.getChildren().add(checker);
        check.setAlignment(Pos.CENTER);
        HBox.setMargin(checker, new Insets(7.0,0,0,0));
        regBut.setOnAction(o ->{
            if (nameF.getText().matches("^[A-Za-zА-Яа-я]*$") == false || nameF.getText().matches("^[A-Za-zА-Яа-я]*$") == false ||
                    nameF.getText().equals("") || lastNameF.getText().equals("") || days.getValue() == null || months.getValue() == null ||
                    years.getValue() == null || inputCard.getText().matches("^[0-9]*$") == false || inputCard.getText().equals("")
                    || inputEmail.getText().equals("") || inputNum.getText().equals("") || passw1.getText().equals("") ||
                    passw2.getText().equals("") || inputNum.getLength() != 13 ||  box.isSelected() == false || obls.getValue() == null){
                        checker.setText("Вы ввели не все данные");
            }
            if (nameF.getText().matches("^[A-Za-zА-Яа-я]*$") && nameF.getText().matches("^[A-Za-zА-Яа-я]*$") &&
                    !nameF.getText().equals("") && !lastNameF.getText().equals("") && days.getValue() != null && months.getValue() != null &&
                    years.getValue() != null && inputCard.getText().matches("^[0-9]*$") && !inputCard.getText().equals("")
                    && !inputEmail.getText().equals("") && !inputNum.getText().equals("") && !passw1.getText().equals("") &&
                    !passw2.getText().equals("") && inputNum.getLength() == 13 &&  box.isSelected()  && obls.getValue() != null){
                checker.setText("Заявка принята");
                String name1 = nameF.getText();
                try{
                    String data = "\nFirstName: " + nameF.getText() + "\nLastName: " + lastNameF.getText() +
                            "\nDay of birth: " + days.getValue() + "\nMonth of birth: " + months.getValue() +
                            "\nYear of birth: " + years.getValue() + "\nCardNumber: " + inputCard.getText() +
                            "\nEmail: " + inputEmail.getText() + "\nPhoneNumber: " + inputNum.getText() +
                            "\nCity: " + obls.getValue() + "\nPassword: " + passw1.getText();
                    FileActions.openfile();
                    FileActions.file.seek(FileActions.file.length());
                    FileActions.file.writeBytes(data);
                    FileActions.file.close();
                } catch (IOException exception){
                    throw new RuntimeException(exception);
                }
            }
            else checker.setText("Неправильно введённые данные");

        });
        reset.setOnAction(o ->{
            nameF.clear();
            lastNameF.clear();
            days.disableProperty();
            days.setValue(null);
            months.setValue(null);
            years.setValue(null);
            inputCard.clear();
            inputEmail.clear();
            inputNum.clear();
            obls.setValue(null);
            passw1.clear();
            passw2.clear();
            box.setSelected(false);
            checker.setText("Заявка очищена");
        });
        VBox root = new VBox(registry, textAfterRegistry, fio, birth,
                date, card, email, num, place, pass, textBelow, persData,
                regButton, check);
        Scene scene = new Scene(root, 550, 700);
        stage.setScene(scene);
        stage.setTitle("Регистрация карточки");
        stage.show();
    }
    public static ArrayList getYear(){
        ArrayList year = new ArrayList();
        int count = 2007;
        while (count>= 1950){
            year.add(count);
            count--;
        }
        return year;
    }

    public static void main(String[] args) {
        launch();
    }
}