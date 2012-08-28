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

public class Font03_Moving_L_Cai_Zhixiang extends PApplet {

/**
 Animation of L: L moving along the x-axis.
 Cai Zhixiang 28/08/2012
 a0087731@nus.edu.sg
 */
public void setup(){
size(400,400);
int i = 0;
}

int i;

public void draw(){
background(133,232,201);
stroke(255);
rect(i,50,50,300);
rect(i,300,150,50);
i++;
// Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font3.jpg"); 
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Font03_Moving_L_Cai_Zhixiang" });
  }
}
