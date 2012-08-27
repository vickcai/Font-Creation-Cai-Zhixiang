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

