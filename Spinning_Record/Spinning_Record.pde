import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
PImage pictureOfRecord;  //as member variable
int imageAngle= 0;
int speed=9;

void setup(){
pictureOfRecord= loadImage("download.jpg");  //in setup method  
size(259,194);
minim = new Minim(this);  //in the setup method
song = minim.loadFile("batman.wav", 512);//in the setup method
}


void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
void draw(){
  if(mousePressed){
     imageAngle=imageAngle+speed;
 rotateImage(pictureOfRecord, imageAngle);
song.play();
  }else{
  song.pause();
  }
   image(pictureOfRecord, 10, 10);//in draw method
}