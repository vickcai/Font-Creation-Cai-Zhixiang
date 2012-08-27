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

public class Front07_blackline_L_Cai_Zhixiang extends PApplet {
  public void setup() {
size(400, 400);
smooth();
fill(0);
stroke(255);
strokeWeight(4);
int a,a1;
a=15;
a1=8;

for (int x=0;x<3;x=x+1) {
  for (int y=0;y<a;y=y+1) 

    rect(x*20+130, y*20+40, 20, 20);
}


for (int x=0;x<a1;x=x+1) {
  for (int y=0;y<3;y=y+1) 

    rect(x*20+130, y*20+300, 20, 20);
}

    // Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font7.jpg"); 

  noLoop();
} 
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Front07_blackline_L_Cai_Zhixiang" });
  }
}
