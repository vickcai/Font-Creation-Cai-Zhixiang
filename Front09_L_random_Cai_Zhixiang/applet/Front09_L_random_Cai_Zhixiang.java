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

public class Front09_L_random_Cai_Zhixiang extends PApplet {
  public void setup() {
size(400,400);
background(80);

stroke(45,234,223);
int x;
int y;
int y1 = 200;
int x1 = 120;
int r = 100;


for(x = 120; x <= 170; x = x + 1 ){

   line(x,325,x,325 - y1 - random(r));
 }
 
for(y = 275; y <= 325 ;y = y + 1){
   line (120,y,120 + x1+ random(r),y);
}

// Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font9.jpg"); 

  noLoop();
} 
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Front09_L_random_Cai_Zhixiang" });
  }
}
