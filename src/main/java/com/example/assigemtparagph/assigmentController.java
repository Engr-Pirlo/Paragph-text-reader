package com.example.assigemtparagph;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class assigmentController implements Initializable {

    @FXML
    private Button btnRun;
    @FXML
    private Button btnRead;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtField;

    public void checking(){
        if(txtField.getText().toLowerCase().contains("a")){
            lbl2.setText("are you looking consonants?");
            lbl2.setStyle("-fx-text-fill: red;");
            countVowels();
        }
        else if (txtField.getText().isEmpty()){
            lbl2.setText("Please Enter Value?");
            lbl2.setStyle("-fx-text-fill: red;");
            countVowels();
        }
        else if(txtField.getText().toLowerCase().contains("e")){
            lbl2.setText("Are You looking Consonants?");
            lbl2.setStyle("-fx-text-fill: red;");
            countVowels();
        }
        else if(txtField.getText().toLowerCase().contains("i")){
            lbl2.setText("Are you looking consonants?");
            lbl2.setStyle("-fx-text-fill: red;");
            countVowels();
        }
        else if(txtField.getText().toLowerCase().contains("o")){
            lbl2.setText("Are you looking consonants?");
            lbl2.setStyle("-fx-text-fill: red;");
            countVowels();
        }
        else if(txtField.getText().toLowerCase().contains("u")){
            lbl2.setText("Are you looking consonants?");
            lbl2.setStyle("-fx-text-fill: red;");
            countVowels();
        }
        else{
            String text = txtArea.getText().toLowerCase();
            String specialConsonant = txtField.getText().toLowerCase();
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (Character.isLetter(c) && c == specialConsonant.charAt(0)) {
                    count++;
                }
            }
            lbl2.setText("The letter "+txtField.getText()+" Repeated "+count+" Time(s) In The Above Text");
            lbl2.setStyle("-fx-text-fill: black;");
            countVowels();

        }


    }
    public void countVowels() {
        String text = txtArea.getText().toLowerCase(); // convert to lowercase
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        lbl1.setText("We have "+count+" vowel(s) in the above text.");
        lbl1.setStyle("-fx-text-fill: black;");
    }
    @FXML
    private AnchorPane anchor;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

//    public void initialize() {
//        try {
//            // Create a Synthesizer object
//            System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
//            SynthesizerModeDesc desc = new SynthesizerModeDesc(null, "general", Locale.US, null, null);
//            synthesizer = javax.speech.Central.createSynthesizer(desc);
//            synthesizer.allocate();
//            synthesizer.resume();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }

//    @FXML
//    private void handleSpeakButtonAction() {
//        // Get the text from the text area
//        String text = txtArea.getText();
//
//        // Convert the text to speech
//        try {
//            synthesizer.speakPlainText(text, null);
//            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//}
}