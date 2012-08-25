size(400,400);
background(200);
stroke(0);
fill(255);

int x0 = 150;
int x1 = 200;
int x2 = 300;
int x3 = 300;

int y0 = 50;
int y1 = 300;
int y2 = 350;
int y3 = 350;
int y4 = 300;

int Y; //index variable for Y
int X; //index variable for X 
int grain_size = 5; // size of the matrixes
fill(255);

for(Y = y0; Y < y1; Y = Y + grain_size){
  for(X = x0; X < x1; X = X + grain_size){
    rect(X,  Y , grain_size, grain_size);
    //ellipse( X , Y , grain_size, grain_size);

  }
}

for(Y = y1; Y < y2; Y = Y + grain_size){
  for(X = x0; X < x2; X = X + grain_size){
    rect(X,  Y , grain_size, grain_size);
    //ellipse( X , Y , grain_size, grain_size);
  }
}

for(Y = y2; Y < y3; Y = Y + grain_size){
  for(X = x0; X < x3; X = X + grain_size){
    rect(X,  Y , grain_size, grain_size);
    //ellipse( X , Y , grain_size, grain_size);
  }
}

for(Y = y3; Y < y4; Y = Y + grain_size){
  for(X = x0; X < x2; X = X + grain_size){
    rect(X,  Y, grain_size, grain_size);
    //ellipse( X , Y , grain_size, grain_size);
  }
}
