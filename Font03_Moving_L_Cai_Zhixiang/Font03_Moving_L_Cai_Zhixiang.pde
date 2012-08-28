/**
 Animation of L: L moving along the x-axis.
 Cai Zhixiang 28/08/2012
 a0087731@nus.edu.sg
 */
void setup(){
size(400,400);
int i = 0;
}

int i;

void draw(){
background(133,232,201);
stroke(255);
rect(i,50,50,300);
rect(i,300,150,50);
i++;
// Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font3.jpg"); 
}
