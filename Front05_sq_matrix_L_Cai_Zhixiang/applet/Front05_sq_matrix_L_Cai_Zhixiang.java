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

public class Front05_sq_matrix_L_Cai_Zhixiang extends PApplet {
  public void setup() {
size(400,400);
background(200);
stroke(0);
fill(255);

int x0 = 150;
int x1 = 200;
int x2 = 300;
int x3 = 300;

int y0 = 50;
int y1 = 300;
int y2 = 350;
int y3 = 350;
int y4 = 300;

int Y; //index variable for Y
int X; //index variable for X 
int grain_size = 5; // size of the matrixes
fill(255);

for(Y = y0; Y < y1; Y = Y + grain_size){
  for(X = x0; X < x1; X = X + grain_size){
    rect(X,  Y , grain_size, grain_size);
    //ellipse( X , Y , grain_size, grain_size);

  }
}

for(Y = y1; Y < y2; Y = Y + grain_size){
  for(X = x0; X < x2; X = X + grain_size){
    rect(X,  Y , grain_size, grain_size);
    //ellipse( X , Y , grain_size, grain_size);
  }
}

for(Y = y2; Y < y3; Y = Y + grain_size){
  for(X = x0; X < x3; X = X + grain_size){
    rect(X,  Y , grain_size, grain_size);
    //ellipse( X , Y , grain_size, grain_size);
  }
}

for(Y = y3; Y < y4; Y = Y + grain_size){
  for(X = x0; X < x2; X = X + grain_size){
    rect(X,  Y, grain_size, grain_size);
    //ellipse( X , Y , grain_size, grain_size);
  }
}
  noLoop();
} 
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Front05_sq_matrix_L_Cai_Zhixiang" });
  }
}
