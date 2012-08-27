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

