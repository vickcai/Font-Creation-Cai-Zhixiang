/**
 Construction of L using strokeweight creating dot illusions: 
 Cai Zhixiang 28/08/2012
 a0087731@nus.edu.sg
 */
 
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

