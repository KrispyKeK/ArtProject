package art.view;

import javax.swing.*;
import art.controller.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class ShapeCanvas extends JPanel
{
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Rectangle> rectangleList;
	private artController app;
	
	public ShapeCanvas(artController app) 
	{
		
	}
}
