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

public class Font01_random_size_of_squarel_L_Cai_Zhixiang extends PApplet {
  public void setup() {
/**
 A L constructed using random size of square.
 Cai Zhixiang 28/08/2012
 a0087731@nus.edu.sg
 */
 

size(400, 400);
background(220);
smooth();
fill(0);
int x;
int y;
fill(8,245,245);
stroke(255);
for (x=0;x<15;x++) {
  for (y=0;y<4;y++) {
    rect(x*12+130, y*12+300, 8, 8);
    strokeWeight(random(0, 5));
  }
}
fill(8,245,245);
stroke(255);
for (x=0;x<5;x++) {
  for (y=0;y<20;y++) {
    rect(x*12+130, y*12+60, 8, 8);
    strokeWeight(random(0, 5));
  }
}

// Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font1.jpg"); 
  noLoop();
} 
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Font01_random_size_of_squarel_L_Cai_Zhixiang" });
  }
}
