package application;
	
import javafx.application.Application;
import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import java.util.*;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button; 
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.PasswordField; 
import javafx.scene.control.*; 
import javafx.collections.*; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage;  
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application { 
   @Override 
   public void start(Stage stage) {
	      //Label for education
	      Label label = new Label("File Data:");
	      Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
	      label.setFont(font);
	      //Creating a table view
	      TableView<FileData> table = new TableView<FileData>();
	      final ObservableList<FileData> data = FXCollections.observableArrayList(
	      );
	      //Creating columns
	      TableColumn fileNameCol = new TableColumn("NIM");
	      fileNameCol.setCellValueFactory(new PropertyValueFactory<>("NIM"));
	      TableColumn sizeCol = new TableColumn("Nama Mahasiswa");
	      sizeCol.setCellValueFactory(new PropertyValueFactory("Nama"));
	      TableColumn dateCol = new TableColumn("Asal Kota");
	      dateCol.setCellValueFactory(new PropertyValueFactory("asal"));
	      dateCol.setPrefWidth(100);
	      //Adding data to the table
	      ObservableList<String> list = FXCollections.observableArrayList();
	      table.setItems(data);
	      table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	      table.getColumns().addAll(fileNameCol,sizeCol, dateCol);
	      //Setting the size of the table
	      Button button1 = new Button("ADD"); 
	      Button button2 = new Button("DELETE"); 
	      Button button3 = new Button("UPDATE"); 

		   Label l1 = new Label("NIM:");
		   TextField i1 = new TextField();
		   Label l2 = new Label("Nama Mahasiswa:");
		   TextField i2 = new TextField();
		   Label l3 = new Label("Kota Asal:");
		   TextField i3 = new TextField();

		   Label ll = new Label("Ingin Menghapus Data?:");
		   Button i1_1 = new Button("Ya");
		   Button i1_2 = new Button("Tidak");
		   Button i1_3 = new Button("Submit");
		   GridPane gridPane11 = new GridPane();    
		      

		      gridPane11.setMinSize(400, 200);
		      
		      gridPane11.setPadding(new Insets(10, 10, 10, 10)); 
		      
		      gridPane11.setVgap(5); 
		      gridPane11.setHgap(5);       
		      
		      gridPane11.setAlignment(Pos.CENTER); 

		      gridPane11.add(ll, 0, 0); 
		      gridPane11.add(i1_1, 1, 1); 
		      gridPane11.add(i1_2, 2, 1);       
		      Scene scene11 = new Scene(gridPane11); 
		      
		      GridPane gridPane111 = new GridPane();    
		      

		      gridPane111.setMinSize(400, 200);
		      
		      gridPane111.setPadding(new Insets(10, 10, 10, 10)); 
		      
		      gridPane111.setVgap(5); 
		      gridPane111.setHgap(5);       
		      
		      gridPane111.setAlignment(Pos.CENTER); 

		      gridPane111.add(l1, 0, 0); 
		      gridPane111.add(i1, 1, 0); 
		      gridPane111.add(l2, 0, 1);       
		      gridPane111.add(i2, 1, 1); 
		      gridPane111.add(l3, 0, 2);       
		      gridPane111.add(i3, 1, 2); 
		     
		      gridPane111.add(i1_3, 0, 3); 
		      Scene scene2 = new Scene(gridPane111); 
	     
		   

		      Button b1 = new Button("Submit"); 
		   
	 
		      GridPane gridPane1 = new GridPane();    
		      

		      gridPane1.setMinSize(400, 200);
		      
		      gridPane1.setPadding(new Insets(10, 10, 10, 10)); 
		      
		      gridPane1.setVgap(5); 
		      gridPane1.setHgap(5);       
		      
		      gridPane1.setAlignment(Pos.CENTER); 

		      gridPane1.add(l1, 0, 0); 
		      gridPane1.add(i1, 1, 0); 
		      gridPane1.add(l2, 0, 1);       
		      gridPane1.add(i2, 1, 1); 
		      gridPane1.add(l3, 0, 2);       
		      gridPane1.add(i3, 1, 2); 
		     
		      gridPane1.add(b1, 0, 3); 
		      Scene scene1 = new Scene(gridPane1); 
		      
		      
		      
	      table.setMaxSize(350, 200);
	      VBox vbox = new VBox();
	      vbox.setSpacing(5);
	      vbox.setPadding(new Insets(10, 50, 50, 60));
	      vbox.getChildren().addAll(label, table,button1,button2,button3);
	      Scene scene = new Scene(vbox, 595, 600);
	      
	      
	      
	      EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
	          public void handle(ActionEvent e)
	          {
	        	  stage.setScene(scene1);
	          }
	      };

	      EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
	          public void handle(ActionEvent e)
	          {
	        	  data.add(new FileData(i1.getText(),i2.getText(),i3.getText()));
	        	  stage.setScene(scene);
	          }
	      };
	      EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
	          public void handle(ActionEvent e)
	          {
	        	  data.remove(table.getSelectionModel().getSelectedIndex());
	        	  stage.setScene(scene);
	          }
	      };
	      EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
	          public void handle(ActionEvent e)
	          {
	        	  data.remove(table.getSelectionModel().getSelectedIndex());
	        	  stage.setScene(scene);
	          }
	      };
	      EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>() {
	          public void handle(ActionEvent e)
	          {
	        	  stage.setScene(scene);
	          }
	      };
	      EventHandler<ActionEvent> event5 = new EventHandler<ActionEvent>() {
	          public void handle(ActionEvent e)
	          {
	        	  data.remove(table.getSelectionModel().getSelectedIndex());
	        	  stage.setScene(scene2);
	          }
	      };
	      EventHandler<ActionEvent> event6 = new EventHandler<ActionEvent>() {
	          public void handle(ActionEvent e)
	          {
	        	  data.add(new FileData(i1.getText(),i2.getText(),i3.getText()));
	        	  stage.setScene(scene);
	          }
	      };
	      button1.setOnAction(event);
	      button2.setOnAction(event2);
	      button3.setOnAction(event5);
	      i1_1.setOnAction(event3);
	      i1_3.setOnAction(event6);
	      b1.setOnAction(event4);
	      //Setting the scene
	      stage.setScene(scene);
	      stage.show();
	   }
	   public static void main(String args[]){
	      launch(args);
	   }
}