PImage pictureOfRecord;  //as member variable
void setup(){
pictureOfRecord= loadImage("download.jpg");  //in setup method  
size(10,10);
}


void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}

void draw(){
  image(pictureOfRecord, 10, 10);//in draw method
}