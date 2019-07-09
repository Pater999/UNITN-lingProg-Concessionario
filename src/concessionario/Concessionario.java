/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionario;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Concessionario extends Application {
    
        Stage mainWindow = null;
        Stage stage = null;
        Persone persone = null;
        ConsoleVideo lblPersone;
        ConsoleVideo lblAutomobili;
        TextField txtCognome;
        TextField txtNome;
        TextField txtAnnoNascita;
        
        BorderPane prepareSceneContent()  {
            
            persone = new Persone();
            
            BorderPane root = new BorderPane();
            VBox vbPersone = new VBox();
            VBox vbAutomobili = new VBox();
            vbPersone.setStyle("-fx-border-color: darkgrey");
            vbAutomobili.setStyle("-fx-border-color: darkgrey");
            lblPersone = new ConsoleVideo();
            lblAutomobili = new ConsoleVideo();
            
            MyButton btnMescolaAuto = new MyButton("Mescola",false,new ListenerMescola());
            MyButton btnMescolaPersone = new MyButton("Mescola",false,new ListenerMescola());
            
            MyButton btnOrdinaAuto = new MyButton("Ordina",false,new ListenerOrdina());
            MyButton btnOrdinaPersone = new MyButton("Ordina",false,new ListenerOrdina());
            
            MyButton btnContaAuto = new MyButton("Conta",false,new ListenerConta());
            MyButton btnContaPersone = new MyButton("Conta",false,new ListenerConta());
            
            MyButton btnOrdinaPrezzoAuto = new MyButton("Ordina per prezzo",false,new ListenerOrdinaPrezzo());
            MyButton btnOrdinaAnnoPersone = new MyButton("Ordina per anno",false,new ListenerOrdinaAnno());
            
            vbPersone.getChildren().addAll(lblPersone, btnMescolaPersone, btnOrdinaPersone, btnContaPersone, btnOrdinaAnnoPersone);
            vbAutomobili.getChildren().addAll(lblAutomobili,btnMescolaAuto,btnOrdinaAuto,btnContaAuto,btnOrdinaPrezzoAuto);

            vbPersone.setAlignment(Pos.TOP_RIGHT);
            
            HBox footerPersone = new HBox();
            footerPersone.setPrefWidth(400);
            footerPersone.setAlignment(Pos.BOTTOM_RIGHT);
            HBox footerAutomobili = new HBox();
            footerAutomobili.setPrefWidth(400);
            footerAutomobili.setAlignment(Pos.BOTTOM_LEFT);

            MyButton btnNuovaPersona = new MyButton("New Person",false,new ListenerNuovaPersona());
            footerPersone.getChildren().add(btnNuovaPersona);
            MyButton btnNuovaAutomobile = new MyButton("New Person",false,new ListenerNuovaAutomobile());
            footerAutomobili.getChildren().add(btnNuovaAutomobile);
            
            HBox footer = new HBox();
            footer.getChildren().addAll(footerPersone,footerAutomobili);
            
            root.setLeft(vbPersone);
            root.setRight(vbAutomobili);
            root.setBottom(footer);
            return root;
        }
        
        @Override
        public void start(Stage primaryStage) {
            Scene scene = new Scene(this.prepareSceneContent(), 800, 500);
            mainWindow = primaryStage;
            primaryStage.setTitle("Concessionario");
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();
            primaryStage.show();
        }
        
        class ListenerMescola implements EventHandler {
            public void handle(Event t) {
                List<Persona> mainList = new LinkedList<Persona>();
                mainList.addAll(persone);
                Collections.shuffle(mainList);
                persone.clear();
                persone.addAll(mainList);
                lblPersone.setText(persone.toString());
            }
        }
        class ListenerOrdina implements EventHandler {
            public void handle(Event t) {
                List<Persona> mainList = new LinkedList<Persona>();
                mainList.addAll(persone);
                mainList.sort((h1, h2) -> h1.field2.compareTo(h2.field2));
                persone.clear();
                persone.addAll(mainList);
                lblPersone.setText(persone.toString());
            }
        }
        class ListenerConta implements EventHandler {
            public void handle(Event t) {
                
            }
        }
        class ListenerOrdinaPrezzo implements EventHandler {
            public void handle(Event t) {
                //FAI QUALCOSA QUI
            }
        }
        class ListenerOrdinaAnno implements EventHandler {
            public void handle(Event t) {
                //FAI QUALCOSA QUI
            }
        }
        class ListenerNuovaPersona implements EventHandler {
            public void handle(Event t) {
                TilePane tp = new TilePane();
                tp.setPrefColumns(1);
                tp.setAlignment(Pos.CENTER);
                tp.setOrientation(Orientation.HORIZONTAL);
                Label lblNome = new Label("Nome: ");
                txtNome = new TextField();
                Label lblCognome = new Label("Cognome: ");
                txtCognome = new TextField();
                Label lblAnnoNascita = new Label("Anno di nascita: ");
                txtAnnoNascita = new TextField();
                
                MyButton btnControllaInserisci = new MyButton("Controlla e inserisci",false, new ListenerInserisci());
                
                
                
                btnControllaInserisci.setPrefWidth(150);
                

                tp.getChildren().addAll(lblNome,txtNome,lblCognome,txtCognome,lblAnnoNascita,txtAnnoNascita,btnControllaInserisci);
                Scene sc = new Scene(tp, 340, 200);
  
                stage = new Stage();
                stage.setTitle("Nuova Persona");
                stage.initOwner(mainWindow);
                stage.initModality(Modality.WINDOW_MODAL);
                stage.setScene(sc);
                stage.setX(100);
                stage.setY(100);

                stage.showAndWait(); 
                
                
        
            }
            
            class ListenerInserisci implements EventHandler {
                public void handle(Event t) {
                    try
                        {
                            if (txtAnnoNascita.getText().isEmpty() && txtNome.getText().isEmpty() && txtCognome.getText().isEmpty())
                            {
                                System.err.println("I campi non possono essere vuoti!!!");
                            } else 
                            {
                                
                                String nome = txtNome.getText();
                                String cognome = txtCognome.getText();
                                int annoNascita = Integer.parseInt(txtAnnoNascita.getText());
                                
       
                                boolean ritorno = persone.add(new Persona(nome,cognome,annoNascita));  // RITORNA QUEL CAZZO CHE VUOLE
                 
                                System.out.println(ritorno);
                                if (ritorno == false)
                                {
                                    System.err.println("La persona è già presente!!!");
                                }
                                else
                                {
                                    stage.close();
                                    lblPersone.setText(persone.toString());
                                    System.out.println(persone.toString());
                                }
                            }
                        }catch(NumberFormatException nfe)
                        {
                             System.err.println("Il terzo campo deve essere un numero!!!");
                        }
                }
            }
                
        }
        class ListenerNuovaAutomobile implements EventHandler {
            public void handle(Event t) {
                //FAI QUALCOSA QUI
            }
        }
        
        

        
        

        
        class ConsoleVideo extends Label
        {
            public ConsoleVideo()
            {
                this.setPrefSize(400, 300);
                this.setStyle("-fx-background-color:white");
              
            }
            
            public void CambiaTesto(String testo)
            {
                this.setText(testo);
            }
        }
        
        class MyButton extends Button
        {
            public MyButton(String testo, boolean isDisabled, EventHandler e)
            {
                
                this.setText(testo);
                this.setDisable(isDisabled);
                this.setEventHandler(ActionEvent.ACTION, e);
            }
        }
        
        


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
