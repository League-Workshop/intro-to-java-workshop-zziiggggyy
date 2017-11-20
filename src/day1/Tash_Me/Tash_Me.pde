boolean stick=false;
PImage mustache;
PImage scott;
void setup()  {
  scott=loadImage("mScott2.jpg");
  size(800,600);
  scott.resize(width,height);
  mustache = loadImage("moustacheForScott.png");
}
int mx = 0;
int my = 0;
void draw() {
  background(scott);
  
  if(stick==true) {
  image(mustache,mx,my,50,50);
  }
  else {
  image(mustache,mouseX,mouseY,50,50);
  }
  if(mousePressed && mouseButton==LEFT) {
    stick = true;
    mx=mouseX;
    my=mouseY;
  
    
  }
  if(mousePressed && mouseButton==RIGHT) {
    stick = false;
  }
}