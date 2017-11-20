boolean stick=false;
PImage unicorn;
PImage rainbow;
void setup()  {
  rainbow=loadImage("RAINBOW.jpg");
  size(800,600);
  rainbow.resize(width,height);
  unicorn = loadImage("unicorn.png");
}
int mx = 0;
int my = 0;
void draw() {
  background(rainbow);
  
  if(stick==true) {
  image(unicorn,mx,my,100,100);
  }
  else {
  image(unicorn,mouseX,mouseY,100,100);
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