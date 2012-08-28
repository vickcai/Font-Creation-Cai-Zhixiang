/**
 Square dot matrix gradation of L: example by yuta nakayama
 Cai Zhixiang 28/08/2012
 a0087731@nus.edu.sg
 */
 
size(400,400);
background(200);
noStroke();
fill(255);


int [] x = {150,200,200,200,300};
int [] y = {50,130,300,300,350};

int Y; //index variable for Y
int X; //index variable for X 
float grain_size = 10; // the size of the dot
float dot_size = grain_size * .8; 
smooth();

int i;
for(i = 0; i < 4; i++ ){
  for(Y = y[i]; Y < y[i+1]; Y = Y + int(grain_size)){
    for(X = x[0]; X < x[i+1]; X = X + int(grain_size)){
    //rect(X,  Y , grain_size, grain_size);
    float d = map(X,x[0],x[i+1],dot_size,dot_size * 0.2);
    //rect( X , Y , d, d);
    rect( X  , Y  , d, d);
 // Saves each frame as screen-0000.tif, screen-0001.tif, etc.
  saveFrame("Font4.jpg"); 
    }

 
  }
}

