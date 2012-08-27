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

public class Font04_dot_matrix_gradationL_Cai_Zhixiang_Vick extends PApplet {
  public void setup() {
size(400,400);
background(200);
noStroke();
fill(255);


int [] x = {150,200,200,200,300};
int [] y = {50,130,300,300,350};

int Y; //index variable for Y
int X; //index variable for X 
float grain_size = 10; // the size of the dot
float dot_size = grain_size * .8f; 
smooth();

int i;
for(i = 0; i < 4; i++ ){
  for(Y = y[i]; Y < y[i+1]; Y = Y + PApplet.parseInt(grain_size)){
    for(X = x[0]; X < x[i+1]; X = X + PApplet.parseInt(grain_size)){
    //rect(X,  Y , grain_size, grain_size);
    float d = map(X,x[0],x[i+1],dot_size,dot_size * 0.2f);
    //rect( X , Y , d, d);
    rect( X  , Y  , d, d);
 // Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font4.jpg"); 
    }

 
  }
}

  noLoop();
} 
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Font04_dot_matrix_gradationL_Cai_Zhixiang_Vick" });
  }
}
