package com.GenSci.sample.bindtest;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

public class PrimaryController {

	@FXML
	AnchorPane pane;
	@FXML
	ToolBar tb1;
	@FXML
	ToolBar tb2;
	@FXML
	Canvas aveCanvas;
	@FXML
	Canvas typeCanvas;
	@FXML
	Button openBtn;
	@FXML
	Button saveBtn;
	@FXML
	Button quitBtn;
	@FXML
	private void quitAction() {
		System.exit(0);
	}
	//
	GraphicsContext g;
	//
	String dir = null;
	@FXML
	private void openAction() {
		File file;
		FileChooser fc = new FileChooser();
		fc.setTitle("open File");
		if(dir != null) {
			fc.setInitialDirectory(new File(dir));
			file = fc.showOpenDialog(null);
		}else {
			file = fc.showOpenDialog(null);
			dir = file.getParent();
		}
		System.out.println(dir);
	}
	@FXML
	private void saveAction() {
		File file;
		FileChooser fc = new FileChooser();
		fc.setTitle("save File");
		if(dir != null) {
			fc.setInitialDirectory(new File(dir));
			file = fc.showSaveDialog(null);
		}else {
			file = fc.showSaveDialog(null);
			dir = file.getParent();
		}
	}
	
	
	@FXML
	protected void initialize() {
		pane.setStyle("-fx-border-color: black;");
		tb1.prefWidthProperty().bind(pane.widthProperty());
		tb2.prefWidthProperty().bind(pane.widthProperty());
		double width = aveCanvas.getWidth();
		double height = aveCanvas.getHeight();
		//aveCanvas.widthProperty().bind(null);
		g = aveCanvas.getGraphicsContext2D();
		g.setStroke(Color.BLACK);
		g.strokeLine(0,0, width, height);
		
	}
   
}
