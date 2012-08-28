import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class Front08_L_withcolorchange_Cai_Zhixiang extends PApplet {

/**
 Construction of an interactive L which user can paint it.
 Cai Zhixiang 28/08/2012
 a0087731@nus.edu.sg
 */
 
  public void setup() {
  size(400, 400);
  background(120);
  }

public void draw() {
  if (mousePressed) {
    fill(40, 240, 240);
  } else {
    fill(95,250,97);
  }
  noStroke();
  rect(mouseX, mouseY, 20, 20);

fill(200);
rect(0,0,400,50);
rect(0,0,150,400);

rect(200,0,100,300);
rect(0,0,100,400);

rect(250,0,400,300);
rect(0,350,400,50);
rect(300,300,200,200);
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Front08_L_withcolorchange_Cai_Zhixiang" });
  }
}
