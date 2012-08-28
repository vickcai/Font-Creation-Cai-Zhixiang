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

public class Front06_line_L_Cai_Zhixiang extends PApplet {

/**
 Construction of L using basic line works. 
 Cai Zhixiang 28/08/2012
 a0087731@nus.edu.sg
 */
 
public void setup(){
size(400,400);

}

public void draw(){

background(200);
fill(255);
stroke(255);
line(150,50,150,350);
line(150,50,200,50);
line(200,50,200,300);
line(150,350,300,350);
line(300,350,300,300);
line(300,300,200,300);


    // Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font6.jpg"); 
}


  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Front06_line_L_Cai_Zhixiang" });
  }
}
