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

public class Font02_DotL_Cai_Zhixiang extends PApplet {
  public void setup() {
/**
 Construction of L using basic dots: eample by yuta nakayama
 Cai Zhixiang 28/08/2012
 a0087731@nus.edu.sg
 */
 
size(400,400);{
background(200);
stroke(255);
fill(0);

int [] p0 = {150,50};
int [] p1 = {150,100};
int [] p2 = {150,150};
int [] p3 = {150,200};
int [] p4 = {150,250};
int [] p5 = {150,300};
int [] p6 = {150,350};
int [] p7 = {200,350};
int [] p8 = {250,350};
int [] p9 = {300,350};
int [] p10 = {300,300};
int [] p11 = {250,300};
int [] p12 = {200,300};
int [] p13 = {200,250};
int [] p14 = {200,200};
int [] p15 = {200,150};
int [] p16 = {200,100};
int [] p17 = {200,50};

ellipse(p0[0],p0[1],8,8);
ellipse(p1[0],p1[1],8,8);
ellipse(p2[0],p2[1],8,8);
ellipse(p3[0],p3[1],8,8);
ellipse(p4[0],p4[1],8,8);
ellipse(p5[0],p5[1],8,8);
ellipse(p6[0],p6[1],8,8);
ellipse(p7[0],p7[1],8,8);
ellipse(p8[0],p8[1],8,8);
ellipse(p9[0],p9[1],8,8);
ellipse(p10[0],p10[1],8,8);
ellipse(p11[0],p11[1],8,8);
ellipse(p12[0],p12[1],8,8);
ellipse(p13[0],p13[1],8,8);
ellipse(p14[0],p14[1],8,8);
ellipse(p15[0],p15[1],8,8);
ellipse(p16[0],p16[1],8,8);
ellipse(p17[0],p17[1],8,8);

// Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font2.jpg"); 
  }
  noLoop();
} 
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "Font02_DotL_Cai_Zhixiang" });
  }
}
