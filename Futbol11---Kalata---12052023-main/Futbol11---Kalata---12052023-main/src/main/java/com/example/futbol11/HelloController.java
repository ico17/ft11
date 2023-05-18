package com.example.futbol11;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import javax.swing.JOptionPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
   @FXML
     ChoiceBox<String> choice_box1;

    @FXML
    ChoiceBox<String> choice_box2;


    @FXML
    ImageView lives;

    @FXML
    ImageView image;

    @FXML
    ImageView league;
    @FXML
    ImageView white_background;

    @FXML
    Button btnGenerate;

    @FXML
    Button btnCheck;

    @FXML
    Button btnGuess;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
     Label name_lbl;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl5;

    @FXML
    private Label lbl6;

    @FXML
    private Label lbl10;

    @FXML
    private Label lbl7;

    @FXML
    private Label lbl8;

    @FXML
    private Label lbl9;

    @FXML
    Label lbl_slider;

    @FXML
    Slider slider;

    @FXML
    TextField txtGuess;

    @FXML
    Slider height_slider;

    @FXML
    Label lbl_height;


    String[] teams={"Arsenal","Botev Plovdiv","Chelsea","Ludogorets","PSG","CSKA","FC Real Madrid","FC Barcelona"};

    String[] leagues={"Bulgarian", "English","French"};

    String[] origin={"Argentina","Bulgaria","Bosnia and Herzrgovina","Poland",};

    String[] positions={"Goalkeeper","Defender","Midfielder","Forward"};


    @FXML
   Label selection;

    boolean check_true = true;
    boolean end = false;

    boolean next = false;

    int lives_int = 3;

    String league_file1 = null;

    boolean bulgarian = false;
    boolean french = false;


    boolean choice_box1_q1 = false;
    boolean choice_box1_q2 = false;
    boolean choice_box1_q3 = false;
    boolean choice_box1_q4 = false;
    boolean choice_box1_q5 = false;
    boolean choice_box1_q6 = false;
    boolean choice_box1_q7 = false;

    int l = 1;


    boolean l1 = false;
    boolean l2 = false;
    boolean l3 = false;
    boolean l4 = false;
    boolean l5 = false;
    boolean l6 = false;
    boolean l7 = false;
    boolean l8 = false;
    boolean l9 = false;
    boolean l10 = false;









    boolean arsenal1_choice_box2 = false;
    boolean chelsea1_choice_box2 = false;
    boolean lugorets1_choice_box2 = false;
    boolean psg1_choice_box2 = false;

    boolean cska1_choice_box2 = false;
    boolean real1_choice_box2 = false;
    boolean barselona1_choice_box2 = false;






    boolean arsenal2_choice_box2 = false;
    boolean chelsea2_choice_box2 = false;
    boolean lugorets2_choice_box2 = false;
    boolean cska2_choice_box2 = false;
    boolean real2_choice_box2 = false;
    boolean barselona2_choice_box2 = false;
    boolean psg2_choice_box2 = false;


    boolean argentina = false;
    boolean bulgaria = false;
    boolean bosnia = false;
    boolean poland = false;



    boolean lbl_1 = false;
    boolean lbl_2 = false;
    boolean lbl_3 = false;
    boolean lbl_4 = false;
    boolean lbl_5 = false;
    boolean lbl_6 = false;

    boolean true_false;
    String string_true_false = null;

    String all_name;
    String surname;



    String input_name;

    int input_year;

    int true_year;

    int input_height;

    int true_height;



    public void blockAllElements(){
        btnGuess.setDisable(true);
        btnCheck.setDisable(true);
        choice_box1.setDisable(true);
        choice_box2.setDisable(true);
        txtGuess.setDisable(true);
    }

    public void UNblockAllElements(){
        btnGuess.setDisable(false);
        btnCheck.setDisable(false);
        choice_box1.setDisable(false);
        choice_box2.setDisable(false);
        txtGuess.setDisable(false);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choice_box1.getItems().addAll("Does he play for __ ?","Has he ever played for __ ?","Is he from __ ?","Does he play as __ ?",
                "Does he play in the __ league ?","Is he __ years old ?" , "Is he older than __ ?" , "Is he younger than __ ?" ,"Is he exactly __ cm ?","Is he taller than __ cm ?","Is he shorter than __ cm ?" );
        choice_box1.setOnAction(this::getData);

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                input_year = (int)slider.getValue();
                lbl_slider.setText(Integer.toString(input_year));
            }
        });

        height_slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                input_height = (int)height_slider.getValue();
                lbl_height.setText(Integer.toString(input_height));
            }
        });
        questions_choicebox2();

        generate_player();
    }





    public void getData(ActionEvent event){
        String selected = choice_box1.getValue();

        if(selected.equals("Does he play for __ ?")){
            choice_box1_q1 = true;

        choice_box1_q2 = false;

        choice_box1_q3 = false;

        choice_box1_q4 = false;

        choice_box1_q5 = false;

        choice_box1_q6 = false;

        choice_box1_q7 = false;


    }else if(selected.equals("Has he ever played for __ ?")){
        choice_box1_q2 = true;

        choice_box1_q1 = false;

        choice_box1_q3 = false;

        choice_box1_q4 = false;

        choice_box1_q5 = false;

        choice_box1_q6 = false;

        choice_box1_q7 = false;

    }else if(selected.equals("Does he play in the __ league ?")){

        choice_box1_q3 = true;

        choice_box1_q1 = false;

        choice_box1_q2 = false;

        choice_box1_q4 = false;

        choice_box1_q5 = false;

        choice_box1_q6 = false;

        choice_box1_q7 = false;

    }else if(selected.equals("Is he __ years old ?") || selected.equals("Is he older than __ ?") || selected.equals("Is he younger than __ ?")){
        choice_box1_q4 = true;

        choice_box1_q1 = false;

        choice_box1_q2 = false;

        choice_box1_q3 = false;

        choice_box1_q5 = false;

        choice_box1_q6 = false;

        choice_box1_q7 = false;


    }else if(selected.equals("Is he exactly __ cm ?") ||selected.equals("Is he taller than __ cm ?") ||selected.equals("Is he shorter than __ cm ?") ){

        choice_box1_q5 = true;

        choice_box1_q1 = false;

        choice_box1_q2 = false;

        choice_box1_q3 = false;

        choice_box1_q4 = false;

        choice_box1_q6 = false;

        choice_box1_q7 = false;


    }else if(selected.equals("Is he from __ ?")){

        choice_box1_q6 = true;

        choice_box1_q1 = false;

        choice_box1_q2 = false;

        choice_box1_q3 = false;

        choice_box1_q4 = false;

        choice_box1_q5 = false;

       choice_box1_q7 = false;

    }else if(selected.equals("Does he play as __ ?")){

            choice_box1_q7 = true;

            choice_box1_q6 = false;

            choice_box1_q1 = false;

            choice_box1_q2 = false;

            choice_box1_q3 = false;

            choice_box1_q4 = false;

            choice_box1_q5 = false;

        }

        selection.setText(selected);

    questions_choicebox2();
}



    public void questions_choicebox2(){

        choice_box2.getItems().setAll("");

        if(choice_box1_q1 == true){
            choice_box2.getItems().addAll(teams);

            slider.setVisible(false);
            lbl_slider.setVisible(false);
            choice_box2.setVisible(true);
            height_slider.setVisible(false);
            lbl_height.setVisible(false);


        }else if(choice_box1_q2 == true){
            choice_box2.getItems().addAll(teams);

            slider.setVisible(false);
            lbl_slider.setVisible(false);
            choice_box2.setVisible(true);
            height_slider.setVisible(false);
            lbl_height.setVisible(false);

        }else if(choice_box1_q3 == true) {
            choice_box2.getItems().addAll(leagues);

            slider.setVisible(false);
            lbl_slider.setVisible(false);
            choice_box2.setVisible(true);
            height_slider.setVisible(false);
            lbl_height.setVisible(false);


        }else if(choice_box1_q4 == true){

            slider.setVisible(true);
            lbl_slider.setVisible(true);
            choice_box2.setVisible(false);
            height_slider.setVisible(false);
            lbl_height.setVisible(false);

        }else if(choice_box1_q5 == true){

            height_slider.setVisible(true);
            lbl_height.setVisible(true);
            slider.setVisible(false);
            lbl_slider.setVisible(false);
            choice_box2.setVisible(false);

        }else if(choice_box1_q6 == true){
            choice_box2.getItems().addAll(origin);

            slider.setVisible(false);
            lbl_slider.setVisible(false);
            choice_box2.setVisible(true);
            height_slider.setVisible(false);
            lbl_height.setVisible(false);

        }else if(choice_box1_q7 == true){
            choice_box2.getItems().addAll(positions);

            slider.setVisible(false);
            lbl_slider.setVisible(false);
            choice_box2.setVisible(true);
            height_slider.setVisible(false);
            lbl_height.setVisible(false);

        }

        String selected2 = choice_box1.getValue();
    }
    ArrayList<String> UsedPlayers = new ArrayList<>();
    ArrayList<PlayerData> players = new ArrayList<>();
    PlayerData pl;
    public void generate_player(){
        players.add(new PlayerData("Lionel","Messi","French","Argentina", "PSG", "Barcelona"," fd","Botev Plovdiv","messi.png",170,35,"Forward"));
        players.add(new PlayerData("Robert","Lewandowski","Spain","Poland", "FC Barcelona","Bayern Munchen"," fd","Botev Plovdiv", "lewa.png",185,34,"Forward"));
        players.add(new PlayerData("Karim","Benzema","Spain","French", "FC Real Madrid", "Lyon","fd "," fd","messi.png",185,35,"Forward"));
//        String[] teams={"Arsenal","Chelsea","Ludogorets","P$G","CSKA","FC Real Madrid","FC Barcelona"};
//        players.add(new PlayerData("Lionel","Messi","French","Argentina", "PSG",170,35));
//        players.add(new PlayerData("Lionel","Messi","French","Argentina", "PSG",170,35));
        ArrayList<PlayerData> UsedPlayers = new ArrayList<>();


        int iterations =0;
    while(true) {
        Random random = new Random();
        int rnd = random.nextInt(2);
        System.out.println("The random num is: " + rnd);
        iterations++;
        if(UsedPlayers.contains(players.get(rnd).firstName) == false) {
            System.out.println("It doesnt contain "+ players.get(rnd).firstName+"!");
            pl = players.get(rnd);
            btnGenerate.setVisible(false);
            UsedPlayers.add(pl);
            break;
        }
        if(iterations>15){
            System.out.println("Probably, all of the players have already been used!");
            if(JOptionPane.showConfirmDialog(null,
                    "Probably, all of the players have already been used! To continue playing, click OK!","The end!",JOptionPane.INFORMATION_MESSAGE)
                    ==JOptionPane.YES_OPTION){
                UsedPlayers.clear();
                resetALL();
                break;
            }else
                System.exit(0);
        }
    }

        UNblockAllElements();
    resetALL();
        Image myImage3 = new Image(getClass().getResourceAsStream("3balls.png"));
            lives.setImage(myImage3);
        Image myImage4 = new Image(getClass().getResourceAsStream("questionPic.png"));
        white_background.setImage(myImage4);
        name_lbl.setText(null);



//        if(next == true){
//
//            Alert a = new Alert((Alert.AlertType.ERROR));
//            a.setContentText("Не може да генерирате нов играч, преди да сте познчли сегашния или Ви свършат животите!");
//            a.setTitle("Грешка");
//
//            a.show();
//
//
//
//
//        }else {
//

//            String file = null;
//
//            image.setVisible(false);
//
//
//            Image myImage3 = new Image(getClass().getResourceAsStream("img-removebg-preview40.png"));
//            white_background.setImage(myImage3);
//
//
//            Image myImage2 = new Image(getClass().getResourceAsStream("3balls.png"));
//            lives.setImage(myImage2);
//
//            lives_int =3;
//
//            resetALL();
//
//            btn1.setVisible(false);
//
//            name_lbl.setVisible(false);
//
//
//
//            if (i == 0) {
//                file = "messi.png";
//                all_name = "Lionel Messi";
//                surname = "messi";
//
//
//                psg1_choice_box2 = true;
//
//                barselona2_choice_box2 = true;
//
//                french = true;
//
//                argentina = true;
//
//                next = true;
//
//                true_year = 35;
//
//                true_height = 170;
//
//
//            } else if (i == 1) {
//                file = "pjanic.png";
//
//                all_name = "Miralem Pjanic";
//                surname = "pjanic";
//
//                chelsea1_choice_box2 = true;
//
//                lugorets2_choice_box2 = true;
//
//                bulgarian = true;
//
//                bosnia = true;
//
//                next = true;
//
//                true_year = 33;
//
//                true_height = 178;
//
//            }else if (i == 2) {
//                file = "lewa.png";
//
//                all_name = "Roebrt Lewandowski";
//                surname = "lewandowski";
//
//                chelsea1_choice_box2 = true;
//
//                lugorets2_choice_box2 = true;
//
//                bulgarian = true;
//
//                poland = true;
//
//                next = true;
//
//                true_year = 33;
//
//                true_height = 178;
//
//            }
//            Image myImage = new Image(getClass().getResourceAsStream(file));
//            image.setImage(myImage);
//        }
    }



    public void check() {
        String selected1 = choice_box1.getValue();
        String selected2 = choice_box2.getValue();
        boolean true_false = false;
        lbl1.setStyle("-fx-font-size: 20px;");


//        choice_box1.getItems().addAll("Does he play for __ ?","Has he ever played for __ ?","Is he from __ ?",
//
//                "Does he play in the __ league?","Is he __ years old ?","Is he exactly __ cm ?");


        if (selected1.equals("Does he play for __ ?") && selected2.contains(pl.team)) {
            true_false = true;
        } else if (selected1.equals("Has he ever played for __ ?")) {
            if (selected2.equalsIgnoreCase(pl.team1) || selected2.equalsIgnoreCase(pl.team2) || selected2.equalsIgnoreCase(pl.team3)) {
                true_false = true;
            }
        } else if (selected1.equals("Is he from __ ?") && selected2.equalsIgnoreCase(pl.nationality)) {
            true_false = true;
        } else if (selected1.equals("Does he play in the __ league ?") && selected2.equalsIgnoreCase(String.valueOf(pl.leage))) {
            true_false = true;
        } else if (selected1.equals("Is he __ years old ?") && input_year == pl.age) {
            true_false = true;
        } else if (selected1.equals("Is he exactly __ cm ?") && input_height == pl.height) {
            true_false = true;
        } else if(selected1.equals("Is he taller than __ cm ?") && input_height > pl.height){
            true_false = true;
        }else if(selected1.equals("Is he shorter than __ cm ?") && input_height < pl.height){
            true_false = true;
        }else if(selected1.equals("Is he older than __ ?") && input_year > pl.age){
            true_false = true;
        }else if(selected1.equals("Is he younger than __ ?") && input_year < pl.age) {
            true_false = true;
        }else if(selected1.equals("Does he play as __ ?") && selected2.equalsIgnoreCase((String.valueOf(pl.pos)))) {
            true_false = true;
        }else {
            true_false = false;
        }


        if (l == 1) {

            lbl1.setTextFill(Color.GREEN);

            if (selected1.equals("Does he play for __ ?")) {
                if (true_false == true) {
                    lbl1.setText("Does he play for " + pl.team + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Does he play for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Has he ever played for __ ?")) {
                if (true_false == true) {
                    lbl1.setText("Has he ever played for " + selected2 + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Is he from __ ?")) {
                if (true_false == true) {
                    lbl1.setText("Is he from " + pl.nationality + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Does he play in the __ league ?")) {
                if (true_false == true) {
                    lbl1.setText("Does he play in the  " + pl.leage + " league - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Does he play in the  " + selected2 + " league - NO");

                }
            } else if (selected1.equals("Is he __ years old ?")) {
                if (true_false == true) {
                    lbl1.setText("Is he  " + pl.age + " years old - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Is he  " + input_year + "years old - NO");

                }
            } else if (selected1.equals("Is he exactly __ cm ?")) {
                if (true_false == true) {
                    lbl1.setText("Is he exactly  " + pl.height + " cm - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Is he exactly  " + input_height + " cm - NO");

                }
            } else if(selected1.equals("Is he taller than __ cm ?")){
                if (true_false == true) {
                    lbl1.setText("Is he taller than  " + input_height + " cm - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Is he taller than  " + input_height + " cm - NO");

                }
            } else if(selected1.equals("Is he shorter than __ cm ?")){
                if (true_false == true) {
                    lbl1.setText("Is he shorter than  " + input_height + " cm - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Is he shorter than  " + input_height + " cm - NO");

                }
            }else if(selected1.equals("Is he older than __ ?")){
                if (true_false == true) {
                    lbl1.setText("Is he older than  " + input_year + "  - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Is he older than  " + input_year + "  - NO");

                }
            }else if(selected1.equals("Is he younger than __ ?")){
                if (true_false == true) {
                    lbl1.setText("Is he younger than  " + input_year + "  - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Is he younger than  " + input_year + "  - NO");

                }
            }else if(selected1.equals("Does he play as __ ?")){
                if (true_false == true) {
                    lbl1.setText("Does he play as " + pl.pos + "  - YES");

                } else {
                    lbl1.setTextFill(Color.RED);
                    lbl1.setText("Does he play as " + selected2 + "  - NO");

                }
            }
            l++;
        } else if (l == 2) {


            lbl2.setTextFill(Color.GREEN);

            if (selected1.equals("Does he play for __ ?")) {
                if (true_false == true) {
                    lbl2.setText("Does he play for " + pl.team + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl2.setTextFill(Color.RED);
                    lbl2.setText("Does he play for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Has he ever played for __ ?")) {
                if (true_false == true) {
                    lbl2.setText("Has he ever played for " + selected2 + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl2.setTextFill(Color.RED);
                    lbl2.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Is he from __ ?")) {
                if (true_false == true) {
                    lbl2.setText("Is he from " + pl.nationality + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl2.setTextFill(Color.RED);
                    lbl2.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Does he play in the __ league ?")) {
                if (true_false == true) {
                    lbl2.setText("Does he play in the  " + pl.leage + " league - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl2.setTextFill(Color.RED);
                    lbl2.setText("Does he play in the  " + selected2 + " league - NO");

                }
            } else if (selected1.equals("Is he __ years old ?")) {
                if (true_false == true) {
                    lbl2.setText("Is he  " + pl.age + " years old - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl2.setTextFill(Color.RED);
                    lbl2.setText("Is he  " + input_year + "years old - NO");

                }
            } else if (selected1.equals("Is he exactly __ cm ?")) {
                if (true_false == true) {
                    lbl2.setText("Is he exactly  " + pl.height + " cm - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl2.setTextFill(Color.RED);
                    lbl2.setText("Is he exactly  " + input_height + " cm - NO");

                }
            }else if(selected1.equals("Is he taller than __ cm ?")){
                if (true_false == true) {
                    lbl2.setText("Is he taller than  " + input_height + " cm - YES");

                } else {
                    lbl2.setTextFill(Color.RED);
                    lbl2.setText("Is he taller than  " + input_height + " cm - NO");

                }
            } else if(selected1.equals("Is he shorter than __ cm ?")){
                if (true_false == true) {
                    lbl2.setText("Is he shorter than  " + input_height + " cm - YES");

                } else {
                    lbl2.setTextFill(Color.RED);
                    lbl2.setText("Is he shorter than  " + input_height + " cm - NO");

                }
            }else if(selected1.equals("Is he older than __ ?")){
                if (true_false == true) {
                    lbl2.setText("Is he older than  " + input_year + "  - YES");

                } else {
                    lbl2.setTextFill(Color.RED);
                    lbl2.setText("Is he older than  " + input_year + "  - NO");

                }
            }else if(selected1.equals("Is he younger than __ ?")) {
                if (true_false == true) {
                    lbl2.setText("Is he younger than  " + input_year + "  - YES");

                } else {
                    lbl2.setTextFill(Color.RED);
                    lbl2.setText("Is he younger than  " + input_year + "  - NO");

                }
            }

            l++;


        } else if (l == 3) {

            lbl3.setTextFill(Color.GREEN);

            if (selected1.equals("Does he play for __ ?")) {
                if (true_false == true) {
                    lbl3.setText("Does he play for " + pl.team + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl3.setTextFill(Color.RED);
                    lbl3.setText("Does he play for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Has he ever played for __ ?")) {
                if (true_false == true) {
                    lbl3.setText("Has he ever played for " + selected2 + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl3.setTextFill(Color.RED);
                    lbl3.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Is he from __ ?")) {
                if (true_false == true) {
                    lbl3.setText("Is he from " + pl.nationality + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl3.setTextFill(Color.RED);
                    lbl3.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Does he play in the __ league ?")) {
                if (true_false == true) {
                    lbl3.setText("Does he play in the  " + pl.leage + " league - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl3.setTextFill(Color.RED);
                    lbl3.setText("Does he play in the  " + selected2 + " league - NO");

                }
            } else if (selected1.equals("Is he __ years old ?")) {
                if (true_false == true) {
                    lbl3.setText("Is he  " + pl.age + " years old - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl3.setTextFill(Color.RED);
                    lbl3.setText("Is he  " + input_year + "years old - NO");

                }
            } else if (selected1.equals("Is he exactly __ cm ?")) {

                if (true_false == true) {
                    lbl3.setText("Is he exactly  " + pl.height + " cm - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl3.setTextFill(Color.RED);
                    lbl3.setText("Is he exactly  " + input_height + " cm - NO");

                }



            }else if(selected1.equals("Is he taller than __ cm ?")){
                if (true_false == true) {
                    lbl3.setText("Is he taller than  " + input_height + " cm - YES");

                } else {
                    lbl3.setTextFill(Color.RED);
                    lbl3.setText("Is he taller than  " + input_height + " cm - NO");

                }
            } else if(selected1.equals("Is he shorter than __ cm ?")){
                if (true_false == true) {
                    lbl3.setText("Is he shorter than  " + input_height + " cm - YES");

                } else {
                    lbl3.setTextFill(Color.RED);
                    lbl3.setText("Is he shorter than  " + input_height + " cm - NO");

                }
            }else if(selected1.equals("Is he older than __ ?")){
                if (true_false == true) {
                    lbl3.setText("Is he older than  " + input_year + "  - YES");

                } else {
                    lbl3.setTextFill(Color.RED);
                    lbl3.setText("Is he older than  " + input_year + "  - NO");

                }
            }else if(selected1.equals("Is he younger than __ ?")) {
                if (true_false == true) {
                    lbl3.setText("Is he younger than  " + input_year + "  - YES");

                } else {
                    lbl3.setTextFill(Color.RED);
                    lbl3.setText("Is he younger than  " + input_year + "  - NO");

                }
            }

            l++;
        }else if (l == 4) {


            lbl4.setTextFill(Color.GREEN);

            if (selected1.equals("Does he play for __ ?")) {
                if (true_false == true) {
                    lbl4.setText("Does he play for " + pl.team + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl4.setTextFill(Color.RED);
                    lbl4.setText("Does he play for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Has he ever played for __ ?")) {
                if (true_false == true) {
                    lbl4.setText("Has he ever played for " + selected2 + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl4.setTextFill(Color.RED);
                    lbl4.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Is he from __ ?")) {
                if (true_false == true) {
                    lbl4.setText("Is he from " + pl.nationality + " - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl4.setTextFill(Color.RED);
                    lbl4.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Does he play in the __ league ?")) {
                if (true_false == true) {
                    lbl4.setText("Does he play in the  " + pl.leage + " league - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl4.setTextFill(Color.RED);
                    lbl4.setText("Does he play in the  " + selected2 + " league - NO");

                }
            } else if (selected1.equals("Is he __ years old ?")) {
                if (true_false == true) {
                    lbl4.setText("Is he  " + pl.age + " years old - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl4.setTextFill(Color.RED);
                    lbl4.setText("Is he  " + input_year + "years old - NO");

                }
            } else if (selected1.equals("Is he exactly __ cm ?")) {
                if (true_false == true) {
                    lbl4.setText("Is he exactly  " + pl.height + " cm - YES");
                    System.out.println("Does he play for " + pl.team + " - YES");

                } else {
                    lbl4.setTextFill(Color.RED);
                    lbl4.setText("Is he exactly  " + input_height + " cm - NO");

                }

            } else if (selected1.equals("Is he taller than __ cm ?")) {
                if (true_false == true) {
                    lbl4.setText("Is he taller than  " + input_height + " cm - YES");

                } else {
                    lbl4.setTextFill(Color.RED);
                    lbl4.setText("Is he taller than  " + input_height + " cm - NO");

                }
            } else if (selected1.equals("Is he shorter than __ cm ?")) {
                if (true_false == true) {
                    lbl4.setText("Is he shorter than  " + input_height + " cm - YES");

                } else {
                    lbl4.setTextFill(Color.RED);
                    lbl4.setText("Is he shorter than  " + input_height + " cm - NO");

                }
            } else if (selected1.equals("Is he older than __ ?")) {
                if (true_false == true) {
                    lbl4.setText("Is he older than  " + input_year + "  - YES");

                } else {
                    lbl4.setTextFill(Color.RED);
                    lbl4.setText("Is he older than  " + input_year + "  - NO");

                }
            } else if (selected1.equals("Is he younger than __ ?")) {
                if (true_false == true) {
                    lbl4.setText("Is he younger than  " + input_year + "  - YES");

                } else {
                    lbl4.setTextFill(Color.RED);
                    lbl4.setText("Is he younger than  " + input_year + "  - NO");

                }
            }

            l++;
        }else if (l == 5) {


            lbl5.setTextFill(Color.GREEN);

            if (selected1.equals("Does he play for __ ?")) {
                if (true_false == true) {
                    lbl5.setText("Does he play for " + pl.team + " - YES");


                } else {
                    lbl5.setTextFill(Color.RED);
                    lbl5.setText("Does he play for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Has he ever played for __ ?")) {
                if (true_false == true) {
                    lbl5.setText("Has he ever played for " + selected2 + " - YES");

                } else {
                    lbl5.setTextFill(Color.RED);;

                }
            } else if (selected1.equals("Is he from __ ?")) {
                if (true_false == true) {
                    lbl5.setText("Is he from " + pl.nationality + " - YES");

                } else {
                    lbl5.setTextFill(Color.RED);
                    lbl5.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Does he play in the __ league ?")) {
                if (true_false == true) {
                    lbl5.setText("Does he play in the  " + pl.leage + " league - YES");

                } else {
                    lbl5.setTextFill(Color.RED);
                    lbl5.setText("Does he play in the  " + selected2 + " league - NO");

                }
            } else if (selected1.equals("Is he __ years old ?")) {
                if (true_false == true) {
                    lbl5.setText("Is he  " + pl.age + " years old - YES");

                } else {
                    lbl5.setTextFill(Color.RED);
                    lbl5.setText("Is he  " + input_year + "years old - NO");

                }
            } else if (selected1.equals("Is he exactly __ cm ?")) {
                if (true_false == true) {
                    lbl5.setText("Is he exactly  " + pl.height + " cm - YES");

                } else {
                    lbl5.setTextFill(Color.RED);
                    lbl5.setText("Is he exactly  " + input_height + " cm - NO");

                }

            } else if (selected1.equals("Is he taller than __ cm ?")) {
                if (true_false == true) {
                    lbl5.setText("Is he taller than  " + input_height + " cm - YES");

                } else {
                    lbl5.setTextFill(Color.RED);

                }
            } else if (selected1.equals("Is he shorter than __ cm ?")) {
                if (true_false == true) {
                    lbl5.setText("Is he shorter than  " + input_height + " cm - YES");

                } else {
                    lbl5.setTextFill(Color.RED);
                    lbl5.setText("Is he shorter than  " + input_height + " cm - NO");

                }
            } else if (selected1.equals("Is he older than __ ?")) {
                if (true_false == true) {
                    lbl5.setText("Is he older than  " + input_year + "  - YES");

                } else {
                    lbl5.setTextFill(Color.RED);

                }
            } else if (selected1.equals("Is he younger than __ ?")) {
                if (true_false == true) {
                    lbl5.setText("Is he younger than  " + input_year + "  - YES");

                } else {
                    lbl5.setTextFill(Color.RED);
                    lbl5.setText("Is he younger than  " + input_year + "  - NO");

                }
            }

            l++;
        }else if (l == 6) {


            lbl6.setTextFill(Color.GREEN);

            if (selected1.equals("Does he play for __ ?")) {
                if (true_false == true) {
                    lbl6.setText("Does he play for " + pl.team + " - YES");


                } else {
                    lbl6.setTextFill(Color.RED);
                    lbl6.setText("Does he play for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Has he ever played for __ ?")) {
                if (true_false == true) {
                    lbl6.setText("Has he ever played for " + selected2 + " - YES");

                } else {
                    lbl6.setTextFill(Color.RED);;

                }
            } else if (selected1.equals("Is he from __ ?")) {
                if (true_false == true) {
                    lbl6.setText("Is he from " + pl.nationality + " - YES");

                } else {
                    lbl6.setTextFill(Color.RED);
                    lbl6.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Does he play in the __ league ?")) {
                if (true_false == true) {
                    lbl6.setText("Does he play in the  " + pl.leage + " league - YES");

                } else {
                    lbl6.setTextFill(Color.RED);
                    lbl6.setText("Does he play in the  " + selected2 + " league - NO");

                }
            } else if (selected1.equals("Is he __ years old ?")) {
                if (true_false == true) {
                    lbl6.setText("Is he  " + pl.age + " years old - YES");

                } else {
                    lbl6.setTextFill(Color.RED);
                    lbl6.setText("Is he  " + input_year + "years old - NO");

                }
            } else if (selected1.equals("Is he exactly __ cm ?")) {
                if (true_false == true) {
                    lbl6.setText("Is he exactly  " + pl.height + " cm - YES");

                } else {
                    lbl6.setTextFill(Color.RED);
                    lbl6.setText("Is he exactly  " + input_height + " cm - NO");

                }

            } else if (selected1.equals("Is he taller than __ cm ?")) {
                if (true_false == true) {
                    lbl6.setText("Is he taller than  " + input_height + " cm - YES");

                } else {
                    lbl6.setTextFill(Color.RED);

                }
            } else if (selected1.equals("Is he shorter than __ cm ?")) {
                if (true_false == true) {
                    lbl6.setText("Is he shorter than  " + input_height + " cm - YES");

                } else {
                    lbl6.setTextFill(Color.RED);
                    lbl6.setText("Is he shorter than  " + input_height + " cm - NO");

                }
            } else if (selected1.equals("Is he older than __ ?")) {
                if (true_false == true) {
                    lbl6.setText("Is he older than  " + input_year + "  - YES");

                } else {
                    lbl6.setTextFill(Color.RED);

                }
            } else if (selected1.equals("Is he younger than __ ?")) {
                if (true_false == true) {
                    lbl6.setText("Is he younger than  " + input_year + "  - YES");

                } else {
                    lbl6.setTextFill(Color.RED);
                    lbl6.setText("Is he younger than  " + input_year + "  - NO");

                }
            }

            l++;

        }else if (l == 7) {


            lbl7.setTextFill(Color.GREEN);

            if (selected1.equals("Does he play for __ ?")) {
                if (true_false == true) {
                    lbl7.setText("Does he play for " + pl.team + " - YES");


                } else {
                    lbl7.setTextFill(Color.RED);
                    lbl7.setText("Does he play for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Has he ever played for __ ?")) {
                if (true_false == true) {
                    lbl7.setText("Has he ever played for " + selected2 + " - YES");

                } else {
                    lbl7.setTextFill(Color.RED);;

                }
            } else if (selected1.equals("Is he from __ ?")) {
                if (true_false == true) {
                    lbl7.setText("Is he from " + pl.nationality + " - YES");

                } else {
                    lbl7.setTextFill(Color.RED);
                    lbl7.setText("Has he ever played for " + selected2 + " - NO");

                }
            } else if (selected1.equals("Does he play in the __ league ?")) {
                if (true_false == true) {
                    lbl7.setText("Does he play in the  " + pl.leage + " league - YES");

                } else {
                    lbl7.setTextFill(Color.RED);
                    lbl7.setText("Does he play in the  " + selected2 + " league - NO");

                }
            } else if (selected1.equals("Is he __ years old ?")) {
                if (true_false == true) {
                    lbl7.setText("Is he  " + pl.age + " years old - YES");

                } else {
                    lbl7.setTextFill(Color.RED);
                    lbl7.setText("Is he  " + input_year + "years old - NO");

                }
            } else if (selected1.equals("Is he exactly __ cm ?")) {
                if (true_false == true) {
                    lbl7.setText("Is he exactly  " + pl.height + " cm - YES");

                } else {
                    lbl7.setTextFill(Color.RED);
                    lbl7.setText("Is he exactly  " + input_height + " cm - NO");

                }

            } else if (selected1.equals("Is he taller than __ cm ?")) {
                if (true_false == true) {
                    lbl7.setText("Is he taller than  " + input_height + " cm - YES");

                } else {
                    lbl7.setTextFill(Color.RED);

                }
            } else if (selected1.equals("Is he shorter than __ cm ?")) {
                if (true_false == true) {
                    lbl7.setText("Is he shorter than  " + input_height + " cm - YES");

                } else {
                    lbl7.setTextFill(Color.RED);
                    lbl7.setText("Is he shorter than  " + input_height + " cm - NO");

                }
            } else if (selected1.equals("Is he older than __ ?")) {
                if (true_false == true) {
                    lbl7.setText("Is he older than  " + input_year + "  - YES");

                } else {
                    lbl7.setTextFill(Color.RED);

                }
            } else if (selected1.equals("Is he younger than __ ?")) {
                if (true_false == true) {
                    lbl7.setText("Is he younger than  " + input_year + "  - YES");

                } else {
                    lbl7.setTextFill(Color.RED);
                    lbl7.setText("Is he younger than  " + input_year + "  - NO");

                }
            }
        }






        }




    public void resetALL(){

        lbl1.setText("");
        lbl2.setText("");
        lbl3.setText("");
        lbl4.setText("");
        lbl5.setText("");
        lbl6.setText("");

//        lbl8.setText("");
//        lbl9.setText("");
//        lbl10.setText("");


        choice_box1.setValue("");
        choice_box2.setValue("");
        txtGuess.setText("");

    }

public boolean checkForName(String name){
        boolean flag=false;
        for(PlayerData pll:players)
            if(pll.firstName.equalsIgnoreCase(name) || pll.lastName.equalsIgnoreCase(name))
                flag = true;

        return flag;
    }




    public void guess() {
        if (txtGuess.getText().equals("")  )
            JOptionPane.showMessageDialog(null, "Incorrect data! Try again!","Error!",JOptionPane.ERROR_MESSAGE);
         else {
            String lives_file = "3balls.png";
            if (txtGuess.getText().equalsIgnoreCase(pl.firstName) || txtGuess.getText().equalsIgnoreCase(pl.lastName)) {
                txtGuess.setText("");





                Alert a = new Alert((Alert.AlertType.CONFIRMATION));
                a.setContentText("Your answer is true");
                a.setTitle("True");

                a.show();

                Image myImage3 = new Image(getClass().getResourceAsStream("white.png"));
                white_background.setImage(myImage3);

                Image myImage4 = new Image(getClass().getResourceAsStream(pl.image_file));
                image.setImage(myImage4);

                blockAllElements();
                btnGenerate.setVisible(true);
                name_lbl.setVisible(true);
                name_lbl.setText(pl.firstName + " " + pl.lastName);

            } else
                lives_int--;

            if (lives_int == 2)
                lives_file = "2balls.png";
            else if (lives_int == 1)
                lives_file = "1ball.png";

            else if (lives_int == 0) {
                //TODO it doesnt change the picture!!!

                name_lbl.setVisible(true);
                name_lbl.setText(pl.firstName + " " + pl.lastName);


                Image myImage3 = new Image(getClass().getResourceAsStream("white.png"));
                white_background.setImage(myImage3);

                Image myImage4 = new Image(getClass().getResourceAsStream(pl.image_file));
                image.setImage(myImage4);

                blockAllElements();
                lives_file = "0balls.png";


                btnGenerate.setVisible(true);


                resetALL();

                lives_int = 3;
            }

            Image myImage2 = new Image(getClass().getResourceAsStream(lives_file));
            lives.setImage(myImage2);

        }
    }
}