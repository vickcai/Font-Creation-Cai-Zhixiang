void setup(){
size(400,400);

}

void draw(){

background(200);
fill(255);
stroke(255);
line(150,50,150,350);
line(150,50,200,50);
line(200,50,200,300);
line(150,350,300,350);
line(300,350,300,300);
line(300,300,200,300);


    // Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font6.jpg"); 
}


