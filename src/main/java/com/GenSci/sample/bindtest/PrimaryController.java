package com.GenSci.sample.bindtest;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

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
	//
	GraphicsContext g;
	
	
	
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
