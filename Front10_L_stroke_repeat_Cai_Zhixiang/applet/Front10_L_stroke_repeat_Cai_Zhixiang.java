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

public class Front10_L_stroke_repeat_Cai_Zhixiang extends PApplet {
  public void setup() {
size(400, 400);
smooth();
 
background(195);
 
fill(15);
for (int i=12; i<25; i++) { //the i<change the length
  line(i*(width/30), 350, i*(width/30), 300); 
  //the length of the horizontal line

for (int j=3; j<28;j++) { //the j<change the length
  line(200, j*(height/30), 150, j*(height/30)); 
  //the length of the vertical line

    // Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font10.jpg"); 
}
}

  noLoop();
} 
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Front10_L_stroke_repeat_Cai_Zhixiang" });
  }
}
