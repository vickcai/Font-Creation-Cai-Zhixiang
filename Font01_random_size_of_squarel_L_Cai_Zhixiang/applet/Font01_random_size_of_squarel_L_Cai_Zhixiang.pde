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
