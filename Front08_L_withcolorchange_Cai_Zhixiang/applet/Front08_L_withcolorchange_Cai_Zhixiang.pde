/**
 Construction of an interactive L which user can paint it.
 Cai Zhixiang 28/08/2012
 a0087731@nus.edu.sg
 */
 
  void setup() {
  size(400, 400);
  background(120);
  }

void draw() {
  if (mousePressed) {
    fill(40, 240, 240);
  } else {
    fill(95,250,97);
  }
  noStroke();
  rect(mouseX, mouseY, 20, 20);

fill(200);
rect(0,0,400,50);
rect(0,0,150,400);

rect(200,0,100,300);
rect(0,0,100,400);

rect(250,0,400,300);
rect(0,350,400,50);
rect(300,300,200,200);
}
