
void setup(){
size(400,400);

}

void draw(){

background(200);
fill(255);
stroke(255);
rect(150,50,50,300);
rect(150,300,150,50);

// Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font1.jpg"); 
}
