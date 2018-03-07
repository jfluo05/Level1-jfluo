int yPosition=0;
int xPosition=100;
int speed=30;
int score=0;

void setup() {
  size(800, 800);

textSize(16);
}

void draw() {
  background(0, 10, 10);
fill(255, 0, 255);
text("Score: " + score, 20, 20);

  fill(0, 180, 200);
  stroke(0, 0, 255);
  ellipse(xPosition, yPosition, 10, 15);
  yPosition=yPosition+speed;
  if (yPosition>height) {
      checkCatch(xPosition);
    
    yPosition=0;
    xPosition = (int)random(width);
    
    fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

  }
  fill(255, 0, 0);
  rect(mouseX, height-100, 100, 100);
}
void checkCatch(int x) {
  if (x > mouseX && x < mouseX+100){
    score++;
  }
  else if (score > 0) {
    score--;
  println("Your score is now: " + score);
}


}